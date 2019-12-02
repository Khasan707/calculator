package by.bsuir.calc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvExpression;
    private TextView tvResult;

    private boolean isEquallyButtonPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOnClickListener();
        tvExpression = findViewById(R.id.tv_expression);
        tvResult = findViewById(R.id.tv_result);
        isEquallyButtonPressed = false;
    }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        if (isEquallyButtonPressed
                && viewId != R.id.btn_equally
                && viewId != R.id.btn_backspace
                && viewId != R.id.btn_clear) {
            tvExpression.setText(tvResult.getText());
            tvResult.setText("");
            isEquallyButtonPressed = false;
        }
        String expressionStr = String.valueOf(tvExpression.getText());
        switch (viewId) {
            case R.id.btn_equally:
                Expression expression = new Expression(tvExpression.getText().toString());
                String resultString = String.valueOf(expression.calculate());
                tvResult.setText(resultString);
                isEquallyButtonPressed = true;
                break;
            case R.id.btn_backspace:
                if (expressionStr.length() > 0) {
                    tvExpression.setText(expressionStr.substring(0, expressionStr.length() - 1));
                    tvResult.setText("");
                }
                break;
            case R.id.btn_clear:
                tvExpression.setText("");
                tvResult.setText("");
                break;
            case R.id.btn_digit_0:
                tvExpression.setText(expressionStr.concat("0"));
                break;
            case R.id.btn_digit_1:
                tvExpression.setText(expressionStr.concat("1"));
                break;
            case R.id.btn_digit_2:
                tvExpression.setText(expressionStr.concat("2"));
                break;
            case R.id.btn_digit_3:
                tvExpression.setText(expressionStr.concat("3"));
                break;
            case R.id.btn_digit_4:
                tvExpression.setText(expressionStr.concat("4"));
                break;
            case R.id.btn_digit_5:
                tvExpression.setText(expressionStr.concat("5"));
                break;
            case R.id.btn_digit_6:
                tvExpression.setText(expressionStr.concat("6"));
                break;
            case R.id.btn_digit_7:
                tvExpression.setText(expressionStr.concat("7"));
                break;
            case R.id.btn_digit_8:
                tvExpression.setText(expressionStr.concat("8"));
                break;
            case R.id.btn_digit_9:
                tvExpression.setText(expressionStr.concat("9"));
                break;
            case R.id.btn_dot:
                tvExpression.setText(expressionStr.concat("."));
                break;
            case R.id.btn_addition:
                tvExpression.setText(expressionStr.concat("+"));
                break;
            case R.id.btn_subtraction:
                tvExpression.setText(expressionStr.concat("-"));
                break;
            case R.id.btn_multiply:
                tvExpression.setText(expressionStr.concat("*"));
                break;
            case R.id.btn_divide:
                tvExpression.setText(expressionStr.concat("/"));
                break;
            case R.id.btn_pi:
                tvExpression.setText(expressionStr.concat("pi"));
                break;
            case R.id.btn_e:
                tvExpression.setText(expressionStr.concat("e"));
                break;
            case R.id.btn_sin:
                tvExpression.setText(expressionStr.concat("sin("));
                break;
            case R.id.btn_cos:
                tvExpression.setText(expressionStr.concat("cos("));
                break;
            case R.id.btn_tan:
                tvExpression.setText(expressionStr.concat("tan("));
                break;
            case R.id.btn_ln:
                tvExpression.setText(expressionStr.concat("ln("));
                break;
            case R.id.btn_log10:
                tvExpression.setText(expressionStr.concat("log10("));
                break;
            case R.id.btn_pow:
                tvExpression.setText(expressionStr.concat("^"));
                break;
            case R.id.btn_sqr:
                tvExpression.setText(expressionStr.concat("^2"));
                break;
            case R.id.btn_sqrt:
                tvExpression.setText(expressionStr.concat("sqrt("));
                break;
            case R.id.btn_open_bracket:
                tvExpression.setText(expressionStr.concat("("));
                break;
            case R.id.btn_close_bracket:
                tvExpression.setText(expressionStr.concat(")"));
                break;
        }
    }

    private void addOnClickListener() {
        findViewById(R.id.btn_digit_0).setOnClickListener(this);
        findViewById(R.id.btn_digit_1).setOnClickListener(this);
        findViewById(R.id.btn_digit_2).setOnClickListener(this);
        findViewById(R.id.btn_digit_3).setOnClickListener(this);
        findViewById(R.id.btn_digit_4).setOnClickListener(this);
        findViewById(R.id.btn_digit_5).setOnClickListener(this);
        findViewById(R.id.btn_digit_6).setOnClickListener(this);
        findViewById(R.id.btn_digit_7).setOnClickListener(this);
        findViewById(R.id.btn_digit_8).setOnClickListener(this);
        findViewById(R.id.btn_digit_9).setOnClickListener(this);
        findViewById(R.id.btn_equally).setOnClickListener(this);
        findViewById(R.id.btn_clear).setOnClickListener(this);
        findViewById(R.id.btn_open_bracket).setOnClickListener(this);
        findViewById(R.id.btn_close_bracket).setOnClickListener(this);
        findViewById(R.id.btn_dot).setOnClickListener(this);
        findViewById(R.id.btn_addition).setOnClickListener(this);
        findViewById(R.id.btn_subtraction).setOnClickListener(this);
        findViewById(R.id.btn_multiply).setOnClickListener(this);
        findViewById(R.id.btn_divide).setOnClickListener(this);
        findViewById(R.id.btn_backspace).setOnClickListener(this);
        findViewById(R.id.btn_pow).setOnClickListener(this);
        findViewById(R.id.btn_e).setOnClickListener(this);
        findViewById(R.id.btn_pi).setOnClickListener(this);
        findViewById(R.id.btn_sin).setOnClickListener(this);
        findViewById(R.id.btn_cos).setOnClickListener(this);
        findViewById(R.id.btn_tan).setOnClickListener(this);
        findViewById(R.id.btn_sqr).setOnClickListener(this);
        findViewById(R.id.btn_sqrt).setOnClickListener(this);
        findViewById(R.id.btn_ln).setOnClickListener(this);
        findViewById(R.id.btn_log10).setOnClickListener(this);
    }
}
