package rainbow.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    TextView output,input;
    Button zero,one,two,three,four,five,six,seven,eight,nine,add,sub,mul,div,mod,equal,clear,del,point,sin,cos,tan,log,ln,sqrt,square,pow,hide;
    String operation;
    double value,valueone,result;
    int subs=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        output=(TextView)findViewById(R.id.output);
        input=(TextView)findViewById(R.id.input);
        zero=(Button)findViewById(R.id.zero);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        point=(Button)findViewById(R.id.point);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.minus);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        mod=(Button)findViewById(R.id.mod);
        equal=(Button)findViewById(R.id.equal);
        clear=(Button)findViewById(R.id.clear);
        del=(Button)findViewById(R.id.delete);
        sin=(Button)findViewById(R.id.sin);
        cos=(Button)findViewById(R.id.cos);
        tan=(Button)findViewById(R.id.tan);
        log=(Button)findViewById(R.id.log);
        ln=(Button)findViewById(R.id.ln);
        sqrt=(Button)findViewById(R.id.sqrt);
        square=(Button)findViewById(R.id.square);
        pow=(Button)findViewById(R.id.pow);
        hide=(Button)findViewById(R.id.hide);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"9");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(!input.getText().toString().contains("."))
                   if(input.getText().equals(""))
                   {
                       input.setText("0.");
                   }
                   else {
                       input.setText(input.getText() + ".");
                   }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "+";
                    input();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "-";
                    input();
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "*";
                    input();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "/";
                    input();
                }
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "%";
                    input();
                }
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int length=input.getText().length();
                String str;
                if(!(length==0)) {
                    str = input.getText().toString();
                    input.setText(str.substring(0, length - 1));
                }
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("SIN(x)");
                    operation="sin";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.sin(value);
                    output.setText("SIN("+value+")=");
                    input.setText(String.valueOf(result));

                }
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("COS(x)");
                    operation="cos";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.cos(value);
                    output.setText("COS("+value+")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("TAN(x)");
                    operation="cos";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.tan(value);
                    output.setText("TAN("+value+")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("log(x)");
                    operation="log";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.log10(value);
                    output.setText("log("+value+")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("ln(x)");
                    operation="ln";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.log(value);
                    output.setText("ln("+value+")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("sqrt(x)");
                    operation="sqrt";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.sqrt(value);
                    output.setText("sqrt("+value+")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("X^2");
                    operation="square";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=value*value;
                    output.setText(String.valueOf(value)+"^2");
                    input.setText(String.valueOf(result));
                }
            }
        });

        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")){

                    value=Double.parseDouble(input.getText().toString());
                    input();
                    operation="pow";
                    output.setText(String.valueOf(value)+"^");
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(output.getText().equals("")&&input.getText().equals(""))){
                    valueone=Double.parseDouble(input.getText().toString());
                    if(operation.equals("+")){
                        value=value+valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("-")){
                        value=value-valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("*")){
                        value=value*valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("/")){
                        value=value/valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("%")){
                        value=value%valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("pow")) {
                        value=Math.pow(value,valueone);
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("sin")){
                        value=Math.sin(valueone);
                        result=value;
                        output.setText("Sin("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("cos")){
                        value=Math.cos(valueone);
                        result=value;
                        output.setText("Cos("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("tan")){
                        value=Math.tan(valueone);
                        result=value;
                        output.setText("Tan("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("log")){
                        value=Math.log10(valueone);
                        result=value;
                        output.setText("Log("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("ln")){
                        value=Math.log(valueone);
                        result=value;
                        output.setText("Ln("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("sqrt")){
                        value=Math.sqrt(valueone);
                        result=value;
                        output.setText("Sqrt("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("square")){
                        value=valueone*valueone;
                        result=value;
                        output.setText("Square("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("sin")){
                        value=Math.sin(valueone);
                        result=value;
                        output.setText("Sin("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }

                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=0;
                valueone=0;
                result=0;
                input.setText("");
                output.setText("");
            }
        });

        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=hide.getText().toString();
                if(val.equals("▲")) {
                    sin.setVisibility(View.GONE);
                    cos.setVisibility(View.GONE);
                    tan.setVisibility(View.GONE);
                    log.setVisibility(View.GONE);
                    sqrt.setVisibility(View.GONE);
                    square.setVisibility(View.GONE);
                    pow.setVisibility(View.GONE);
                    ln.setVisibility(View.GONE);
                    hide.setText("▼");
                }
                else{
                    sin.setVisibility(View.VISIBLE);
                    cos.setVisibility(View.VISIBLE);
                    tan.setVisibility(View.VISIBLE);
                    log.setVisibility(View.VISIBLE);
                    sqrt.setVisibility(View.VISIBLE);
                    square.setVisibility(View.VISIBLE);
                    pow.setVisibility(View.VISIBLE);
                    ln.setVisibility(View.VISIBLE);
                    hide.setText("▲");
                }

            }
        });

    }
    void input(){
        value=Double.parseDouble(input.getText().toString());
        input.setText("");
        output.setText(value+operation);
    }

}
