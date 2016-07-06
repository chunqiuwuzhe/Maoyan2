package com.yangbo.maoyan1.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.alipay.sdk.app.PayTask;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.ShopCart.ShoppingCart;
import com.yangbo.maoyan1.adapter.shopCarsAdapter;
import com.yangbo.maoyan1.utils.CartProvider;
import com.yangbo.maoyan1.zf.PayResult;
import com.yangbo.maoyan1.zf.SignUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class shoppingCarsActivity extends Activity {
    private CartProvider cartProvider;

    private RecyclerView rcl_shoppingcar;
    private CheckBox checkbox_all;
    private TextView tv_total_price;
    private Button btn_order;
    private Button btn_delete;
    private Button btn_cart;
    private List<ShoppingCart> datas;

    private shopCarsAdapter carsAdapter;
    private boolean checkAll;

    private static final int EDIT = 1;
    private static final int FINISH = 2;


    // 商户PID
    public static final String PARTNER = "2088911876712776";
    // 商户收款账号
    public static final String SELLER = "chenlei@atguigu.com";
    // 商户私钥，pkcs8格式
    public static final String RSA_PRIVATE = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAM6/yIZvq/NyeGDH\n" +
            "5qvkbeTOQzsW7JEwsfvJ5oQPwjTrvehLH9r+KvRV3urpASRZsbJvJ+yp4EtydaxP\n" +
            "wGb9yP4o8ZrPQpwsFQcvXJBlou0MC+yIt9zV2NzqWwsKNJxB7WfZFZyN9ku4EbTD\n" +
            "hwZ+Tmhyc60VyuUgetGIE19VIB27AgMBAAECgYBsHh7fLsbdKJ+K/P7EJVDStoqx\n" +
            "++r6glyRL6Q8q4ED68QEFkUyYHhWDhHlBrRyLfWfOkHGoY+J5PFkitAzC8RvM03k\n" +
            "XwF0l97XLBik0e/dyLfqmIKcWstNg2pLbm65koc04YNSH/uQc2Oxt4rV4MgdDhHj\n" +
            "5F5QuHgpxPjsr3RTAQJBAP9IDD+YJ8nHbGhQbDX84Ja2/gFnNdadJ1gjRolsorZr\n" +
            "0Lrg1fZXeQKEbEPr1/4zkf2MZkw7oHvpKT7BltbpGJ0CQQDPVMOHfs4R2CEHtMT5\n" +
            "PAqZ+umgE04Y/b0cMuBI5FwD+JJFtEVAwCoVA1NKVBb9Ickk9MRZrXef9ghlvmjR\n" +
            "oOQ3AkAmQkgDp+weo5Ktt4/gL3wBWn+K+krpVTg2T2Mc6XkhWds4hsXKW6W5KNuI\n" +
            "+mmuoU/57fbO6gjNSU5zJ1RR9TFJAkBDPeN4Y1jkEquLu0YS6zUpAWaZ4wj2M/0M\n" +
            "UzfIjD+Hjiuqba/0Mx6y1/RAbAtUp4t77+Jqj0b32yyYCuwl6L97AkB0OEGTEBGs\n" +
            "VR7KZR6AbvVIeYuDQEx4oE/z11txPEYpBi8edTKdcrxJJlIARdkXPKeIMSXacLur\n" +
            "ZnhNZwhCiSWh";
    // 支付宝公钥
    public static final String RSA_PUBLIC = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDOv8iGb6vzcnhgx+ar5G3kzkM7\n" +
            "FuyRMLH7yeaED8I0673oSx/a/ir0Vd7q6QEkWbGybyfsqeBLcnWsT8Bm/cj+KPGa\n" +
            "z0KcLBUHL1yQZaLtDAvsiLfc1djc6lsLCjScQe1n2RWcjfZLuBG0w4cGfk5ocnOt\n" +
            "FcrlIHrRiBNfVSAduwIDAQAB";
    private static final int SDK_PAY_FLAG = 1;

    @SuppressLint("HandlerLeak")
    private Handler mHandler = new Handler() {
        @SuppressWarnings("unused")
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case SDK_PAY_FLAG: {
                    PayResult payResult = new PayResult((String) msg.obj);
                    /**
                     * 同步返回的结果必须放置到服务端进行验证（验证的规则请看https://doc.open.alipay.com/doc2/
                     * detail.htm?spm=0.0.0.0.xdvAU6&treeId=59&articleId=103665&
                     * docType=1) 建议商户依赖异步通知
                     */
                    String resultInfo = payResult.getResult();// 同步返回需要验证的信息

                    String resultStatus = payResult.getResultStatus();
                    // 判断resultStatus 为“9000”则代表支付成功，具体状态码代表含义可参考接口文档
                    if (TextUtils.equals(resultStatus, "9000")) {
                        Toast.makeText(shoppingCarsActivity.this, "支付成功", Toast.LENGTH_SHORT).show();
                    } else {
                        // 判断resultStatus 为非"9000"则代表可能支付失败
                        // "8000"代表支付结果因为支付渠道原因或者系统原因还在等待支付结果确认，最终交易是否成功以服务端异步通知为准（小概率状态）
                        if (TextUtils.equals(resultStatus, "8000")) {
                            Toast.makeText(shoppingCarsActivity.this, "支付结果确认中", Toast.LENGTH_SHORT).show();

                        } else {
                            // 其他值就可以判断为支付失败，包括用户主动取消支付，或者系统返回的错误
                            Toast.makeText(shoppingCarsActivity.this, "支付失败", Toast.LENGTH_SHORT).show();

                        }
                    }
                    break;
                }
                default:
                    break;
            }
        }

        ;
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_shopping_cars);
        this.cartProvider = new CartProvider(this);
        datas = cartProvider.getAllData();
        findViews();
        isCheckAll();

    }

    private void findViews() {
        rcl_shoppingcar = (RecyclerView) findViewById(R.id.rcl_shoppingcar);
        checkbox_all = (CheckBox) findViewById(R.id.checkbox_all);
        tv_total_price = (TextView) findViewById(R.id.tv_total_price);
        btn_order = (Button) findViewById(R.id.btn_order);
        btn_delete = (Button) findViewById(R.id.btn_delete);
        btn_cart = (Button) findViewById(R.id.btn_cart);
        //设置适配器
        carsAdapter = new shopCarsAdapter(this, datas, checkbox_all, tv_total_price);
        //设置布局管理器
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rcl_shoppingcar.setLayoutManager(layoutManager);
        rcl_shoppingcar.setAdapter(carsAdapter);
        //某一个item的点击事件
        carsAdapter.setMyItemOnClickLinsster(new shopCarsAdapter.MyItemOnClickLinsster() {
            @Override
            public void itemOnClickLinster(View view, int position) {
                //把当前item的状态取反
                ShoppingCart cart = datas.get(position);
                cart.setIsCheck(!cart.isCheck());
                //刷新
                carsAdapter.notifyItemChanged(position);
                //设置全选的状态
                isCheckAll();
                //刷新价格
                carsAdapter.showTotalPrice();
            }
        });
        //全选按钮的点击事件
        checkbox_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(shoppingCarsActivity.this, "全选", Toast.LENGTH_SHORT).show();
                //得到全选按钮的状态
                boolean flag = checkbox_all.isChecked();
                //设置全选或全不选的方法
                checkboxAll(flag);
                //刷新价格
                carsAdapter.showTotalPrice();
            }
        });
        btn_cart.setTag(EDIT);
        //编辑的点击事件
        btn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_cart.getTag() == EDIT) {//编辑状态
                    //显示删除按钮
                    showDelete();
                } else if (btn_cart.getTag() == FINISH) {//完成状态
                    //隐藏删除按钮
                    hideDelete();
                }
                //刷新价格
                carsAdapter.showTotalPrice();
            }
        });
        //删除的点击事件
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteMethod();
            }
        });
        //支付按钮点击事件
        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pay();
            }
        });
    }

    private void deleteMethod() {
        if (datas.size() > 0 && datas != null) {
            for (Iterator iterator = datas.iterator(); iterator.hasNext(); ) {
                ShoppingCart cart = (ShoppingCart) iterator.next();
                if (cart.isCheck()) {
                    //获取当前item的位置
                    int position = datas.indexOf(cart);
                    //移除数据
                    iterator.remove();
                    //更新本地
                    cartProvider.delete(cart);

                    //刷新
                    carsAdapter.notifyItemRemoved(position);
                }
            }

        }
    }

    private void hideDelete() {
        //设置文本为编辑
        btn_cart.setText("编辑");
        //隐藏删除按钮
        btn_delete.setVisibility(View.GONE);
        //显示结算按钮
        btn_order.setVisibility(View.VISIBLE);
        //设置全选为选中
        checkboxAll(true);
        checkbox_all.setChecked(true);
        //显示价格
        tv_total_price.setVisibility(View.VISIBLE);
        //设置状态为edit
        btn_cart.setTag(EDIT);
    }

    private void showDelete() {
        //设置文本为完成
        btn_cart.setText("完成");
        //显示删除按钮
        btn_delete.setVisibility(View.VISIBLE);
        //隐藏结算按钮
        btn_order.setVisibility(View.GONE);
        //设置全选为不选中
        checkboxAll(false);
        checkbox_all.setChecked(false);
        //隐藏价格
        tv_total_price.setVisibility(View.GONE);
        //设置状态为finish
        btn_cart.setTag(FINISH);
    }

    private void checkboxAll(boolean flag) {
        if (datas != null && datas.size() > 0) {
            for (int i = 0; i < datas.size(); i++) {
                ShoppingCart cart = datas.get(i);
                cart.setIsCheck(flag);
                //刷新状态
                carsAdapter.notifyItemChanged(i);
            }
        }
    }

    public boolean isCheckAll() {
        if (datas != null && datas.size() > 0) {
            int number = 0;
            for (int i = 0; i < datas.size(); i++) {
                ShoppingCart cart = datas.get(i);
                if (!cart.isCheck()) {
                    checkbox_all.setChecked(false);
                } else {
                    number += 1;
                }
            }
            if (number == datas.size()) {
                checkbox_all.setChecked(true);
            }
        }
        return checkAll;
    }

    /**
     * call alipay sdk pay. 调用SDK支付
     */
    public void pay() {
        if (TextUtils.isEmpty(PARTNER) || TextUtils.isEmpty(RSA_PRIVATE) || TextUtils.isEmpty(SELLER)) {
            new AlertDialog.Builder(this).setTitle("警告").setMessage("需要配置PARTNER | RSA_PRIVATE| SELLER")
                    .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialoginterface, int i) {
                            //
                            finish();
                        }
                    }).show();
            return;
        }
        String orderInfo = getOrderInfo("测试的商品", "该测试商品的详细描述", "0.01");

        /**
         * 特别注意，这里的签名逻辑需要放在服务端，切勿将私钥泄露在代码中！
         */
        String sign = sign(orderInfo);
        try {
            /**
             * 仅需对sign 做URL编码
             */
            sign = URLEncoder.encode(sign, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        /**
         * 完整的符合支付宝参数规范的订单信息
         */
        final String payInfo = orderInfo + "&sign=\"" + sign + "\"&" + getSignType();

        Runnable payRunnable = new Runnable() {

            @Override
            public void run() {
                // 构造PayTask 对象
                PayTask alipay = new PayTask(shoppingCarsActivity.this);
                // 调用支付接口，获取支付结果
                String result = alipay.pay(payInfo, true);

                Message msg = new Message();
                msg.what = SDK_PAY_FLAG;
                msg.obj = result;
                mHandler.sendMessage(msg);
            }
        };

        // 必须异步调用
        Thread payThread = new Thread(payRunnable);
        payThread.start();
    }

    /**
     * create the order info. 创建订单信息
     */
    private String getOrderInfo(String subject, String body, String price) {

        // 签约合作者身份ID
        String orderInfo = "partner=" + "\"" + PARTNER + "\"";

        // 签约卖家支付宝账号
        orderInfo += "&seller_id=" + "\"" + SELLER + "\"";

        // 商户网站唯一订单号
        orderInfo += "&out_trade_no=" + "\"" + getOutTradeNo() + "\"";

        // 商品名称
        orderInfo += "&subject=" + "\"" + subject + "\"";

        // 商品详情
        orderInfo += "&body=" + "\"" + body + "\"";

        // 商品金额
        orderInfo += "&total_fee=" + "\"" + price + "\"";

        // 服务器异步通知页面路径
        orderInfo += "&notify_url=" + "\"" + "http://notify.msp.hk/notify.htm" + "\"";

        // 服务接口名称， 固定值
        orderInfo += "&service=\"mobile.securitypay.pay\"";

        // 支付类型， 固定值
        orderInfo += "&payment_type=\"1\"";

        // 参数编码， 固定值
        orderInfo += "&_input_charset=\"utf-8\"";

        // 设置未付款交易的超时时间
        // 默认30分钟，一旦超时，该笔交易就会自动被关闭。
        // 取值范围：1m～15d。
        // m-分钟，h-小时，d-天，1c-当天（无论交易何时创建，都在0点关闭）。
        // 该参数数值不接受小数点，如1.5h，可转换为90m。
        orderInfo += "&it_b_pay=\"30m\"";

        // extern_token为经过快登授权获取到的alipay_open_id,带上此参数用户将使用授权的账户进行支付
        // orderInfo += "&extern_token=" + "\"" + extern_token + "\"";

        // 支付宝处理完请求后，当前页面跳转到商户指定页面的路径，可空
        orderInfo += "&return_url=\"m.alipay.com\"";

        // 调用银行卡支付，需配置此参数，参与签名， 固定值 （需要签约《无线银行卡快捷支付》才能使用）
        // orderInfo += "&paymethod=\"expressGateway\"";

        return orderInfo;
    }

    /**
     * get the out_trade_no for an order. 生成商户订单号，该值在商户端应保持唯一（可自定义格式规范）
     */
    private String getOutTradeNo() {
        SimpleDateFormat format = new SimpleDateFormat("MMddHHmmss", Locale.getDefault());
        Date date = new Date();
        String key = format.format(date);

        Random r = new Random();
        key = key + r.nextInt();
        key = key.substring(0, 15);
        return key;
    }

    /**
     * sign the order info. 对订单信息进行签名
     *
     * @param content 待签名订单信息
     */
    private String sign(String content) {
        return SignUtils.sign(content, RSA_PRIVATE);
    }

    /**
     * get the sign type we use. 获取签名方式
     */
    private String getSignType() {
        return "sign_type=\"RSA\"";
    }
}
