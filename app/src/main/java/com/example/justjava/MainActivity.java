package com.example.justjava;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity=0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Increment(View view ){
        quantity = quantity+1;
        display(quantity);
    }
    public void Decrement(View view ){
        if (quantity > 0){
        quantity=quantity - 1;}
        display(quantity);
    }




    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String PriceMessage="Total:"+"$"+quantity*5;
        String thanks="\nThank You!!! Enjoy Your Coffee;)";
        display(quantity);
        displayMessage(PriceMessage+thanks);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.text0);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.textprice);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.textprice);
        priceTextView.setText(message);
    }

}