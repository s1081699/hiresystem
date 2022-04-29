package tw.edu.pu.csim.luna.hiresystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity2 extends AppCompatActivity {

    public Button btn;
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = (Button) findViewById(R.id.button3);//繫結登入按鈕
        AlertDialog.Builder builder;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.app.AlertDialog dialog = null;
                android.app.AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this)
                        .setTitle("賬號或密碼不能為空")         //設定對話方塊的標題
                        .setIcon(R.mipmap.ic_launcher)        //設定對話方塊標題圖示
                        .setMessage("請輸入賬號和密碼")        //設定對話方塊的提示資訊
                        //新增"確定"按鈕
                        .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();               //關閉對話方塊
                                MainActivity2.this.finish();          //關閉MainActivity
                            }
                        })
                        //新增“取消”按鈕
                        .setNeutralButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();               //關閉對話方塊
                            }

                        });
                dialog.show();
            }
        });
    }
    public void btn_onclick3(View view) {

    }
}




