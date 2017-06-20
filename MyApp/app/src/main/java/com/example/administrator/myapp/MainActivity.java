package com.example.administrator.myapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.EditText;
import android.widget.TextView;





public class MainActivity extends AppCompatActivity {
    private Button button01;
    private Button button02;
    private Button button03;
    private RadioGroup radioGroup;
    private Button radioFour;
    private Button radioThree;
    private int actors;
    private EditText editText00;
    private EditText editText01;
    private EditText editText02;
    private EditText editText03;
    private EditText editText10;
    private EditText editText11;
    private EditText editText12;
    private EditText editText13;
    private EditText editText20;
    private EditText editText21;
    private EditText editText22;
    private EditText editText23;

    private TextView ding;
    private EditText duoDa;
    private TextView result00;
    private TextView result01;
    private TextView result02;
    private TextView result03;
    private EditText ed[]=new EditText[12];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        button01=(Button)findViewById( R.id.button01);
        button01.setOnClickListener(new MyButton01());
        button02=(Button)findViewById(R.id.button02);
        button02.setOnClickListener(new MyButton02());
        button03=(Button)findViewById(R.id.button03);
        button03.setOnClickListener(new MyButton03());
        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new MyCheckedChangeListener());
        radioFour=(Button) findViewById(R.id.radioFour);
        radioThree=(Button)findViewById(R.id.radioThree);
        editText00=(EditText)findViewById(R.id.editText00);
        editText01=(EditText)findViewById(R.id.editText01);
        editText02=(EditText)findViewById(R.id.editText02);
        editText03=(EditText)findViewById(R.id.editText03);
        editText10=(EditText)findViewById(R.id.editText10);
        editText11=(EditText)findViewById(R.id.editText11);
        editText12=(EditText)findViewById(R.id.editText12);
        editText13=(EditText)findViewById(R.id.editText13);
        editText20=(EditText)findViewById(R.id.editText20);
        editText21=(EditText)findViewById(R.id.editText21);
        editText22=(EditText)findViewById(R.id.editText22);
        editText23=(EditText)findViewById(R.id.editText23);

        ding=(TextView)findViewById(R.id.ding);
        duoDa=(EditText) findViewById(R.id.duoDa);
      result00=(TextView)findViewById(R.id.result00);
        result01=(TextView)findViewById(R.id.result01);
        result02=(TextView)findViewById(R.id.result02);
        result03=(TextView)findViewById(R.id.result03);

        ed[0]=editText00;
        ed[1]=editText01;
        ed[2]=editText02;
        ed[3]=editText03;
        ed[4]=editText10;
        ed[5]=editText11;
        ed[6]=editText12;
        ed[7]=editText13;
        ed[8]=editText20;
        ed[9]=editText21;
        ed[10]=editText22;
        ed[11]=editText23;



    }
    private class MyButton03 implements View.OnClickListener{
        @Override
        public void onClick(View view2) {
            duoDa.setText("");
            for(int i=0;i<12;i++){
                ed[i].setText("");
            }
            result00.setText("");
            result01.setText("");
            result02.setText("");
            result03.setText("");


        }
    }
    private class MyButton02 implements View.OnClickListener{



        @Override
        public void onClick(View view1) {

             for(int i=0;i<12;i++){
               if (ed[i].getText().toString().equals("")){
                   ed[i].setText("0");
               }
             }
            int m=Integer.parseInt(duoDa.getText().toString()) ;
           int a=Integer.parseInt(editText20.getText().toString());
            int b=Integer.parseInt((editText21.getText().toString())) ;
            int c=Integer.parseInt(editText22.getText().toString());
            int d=Integer.parseInt(editText23.getText().toString());
            int at= Integer.parseInt(editText10.getText().toString());
            int bt= Integer.parseInt(editText11.getText().toString());
            int ct= Integer.parseInt(editText12.getText().toString());
            int dt= Integer.parseInt(editText13.getText().toString());
            int ahn= Integer.parseInt(editText00.getText().toString());
            int bhn= Integer.parseInt(editText01.getText().toString());
            int chn= Integer.parseInt(editText02.getText().toString());
            int dhn= Integer.parseInt(editText03.getText().toString());
            int re1=0;
            int re2=0;
            int re3=0;
            int re4=0;
          int hn1=0;
            int hn2=0;
           int hn3=0;
            int hn4=0;

            if(a>=b){
               re1=at+bt;
            }else{
               re1=-(at+bt);
            }
            if(a>=c){
                re1=re1+at+ct;
            }else{
                re1=-(at+ct)+re1;
            }
            if(a>=d){
                re1=re1+at+dt;
            }else{
               re1=-(at+dt)+re1;
            }

            if(b>=a){
                re2=at+bt;
            }else{re2=-(at+bt);}
            if(b>=c){
                re2=bt+ct+re2;
            }else{re2=-(bt+ct)+re2;}
            if(b>=d){
                re2=bt+dt+re2;
            }else{re2=-(dt+bt)+re2;}

            if(c>=a){
                re3=ct+at;
            }else{re3=-(ct+at);}
            if(c>=b){
                re3=ct+bt+re3;
            }else{re3=-(ct+bt)+re3;}
            if(c>=d){
                re3=ct+dt+re3;
            }else{re3=-(ct+dt)+re3;}

            if(d>=a){
                re4=dt+at;
            }else{re4=-(dt+at);}
            if(d>=b){
                re4=dt+bt+re4;
            }else{re4=-(dt+bt)+re4;}
            if(d>=c){
                re4=dt+ct+re4;
            }else{re4=-(dt+ct)+re4;}
            hn1=(a-b)*m*(ahn+1)*(bhn+1)+(a-c)*m*(ahn+1)*(chn+1)+(a-d)*m*(ahn+1)*(dhn+1);
            hn2=(b-a)*m*(bhn+1)*(ahn+1)+(b-c)*m*(bhn+1)*(chn+1)+(b-d)*m*(bhn+1)*(dhn+1);
            hn3=(c-a)*m*(chn+1)*(ahn+1)+(c-b)*m*(chn+1)*(bhn+1)+(c-d)*m*(chn+1)*(dhn+1);
            hn4=(d-a)*m*(dhn+1)*(ahn+1)+(d-b)*m*(dhn+1)*(bhn+1)+(d-c)*m*(dhn+1)*(chn+1);
            result00.setText(re1+hn1+"");
            result01.setText(re2+hn2+"");
            result02.setText(re3+hn3+"");
            result03.setText(re4+hn4+"");

        }
    }

  private class MyCheckedChangeListener implements RadioGroup.OnCheckedChangeListener{
      @Override
      public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
          boolean flag;
          if(radioFour.getId()==checkId){
              actors=4;
             flag=true;
              ding.setEnabled(flag);
              editText03.setEnabled(flag);
              editText13.setEnabled(flag);
              editText23.setEnabled(flag);
          }else{
              actors=4;
              flag=false;
              ding.setEnabled(flag);

              editText03.setEnabled(flag);
              editText13.setEnabled(flag);
              editText23.setEnabled(flag);

          }


      }
  }






    private class MyButton01 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            System.exit(0);
        }
    }
}
