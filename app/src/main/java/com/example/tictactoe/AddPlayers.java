package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        EditText playerOne = findViewById(R.id.playerOne);
        EditText playerTwo = findViewById(R.id.playerTwo);
        Button startGameButton = findViewById(R.id.startGameButton);
        Button startGameButtonAI = findViewById(R.id.startGameButtonAI);

        startGameButton.setOnClickListener(view -> {

            String getPlayerOneName = playerOne.getText().toString();
            String getPlayerTwoName = playerTwo.getText().toString();

            if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()) {
                Toast.makeText(AddPlayers.this, "Please enter player name", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(AddPlayers.this, MainActivity.class);
                intent.putExtra("playerOne", getPlayerOneName);
                intent.putExtra("playerTwo", getPlayerTwoName);
                startActivity(intent);
            }
        });

        startGameButtonAI.setOnClickListener(view -> {

            String getPlayerOneName = playerOne.getText().toString();
            String getPlayerTwoName = playerTwo.getText().toString();

            if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()) {
                Toast.makeText(AddPlayers.this, "Please enter player name", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(AddPlayers.this, MainActivity.class);
                intent.putExtra("playerOne", getPlayerOneName);
                intent.putExtra("playerTwo", getPlayerTwoName);
                startActivity(intent);
            }
        });

    }

}