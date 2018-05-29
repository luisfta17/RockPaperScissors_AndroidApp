package com.example.codeclan.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private TextView result, instructions;
    private Button rock, paper, scissors;
    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        result = findViewById(R.id.result);
        rock = findViewById(R.id.Rock);
        paper = findViewById(R.id.Paper);
        scissors = findViewById(R.id.Scissors);
        instructions = findViewById(R.id.instructions);
        game = new Game();
    }

    public void onRockClickButton(View view){
        instructions.setText(game.getWinner(GameOption.ROCK.getName()));
        result.setText(game.getAllTotal());

    }
    public void onPaperClickButton(View view){
        instructions.setText(game.getWinner(GameOption.PAPER.getName()));
        result.setText(game.getAllTotal());

    }
    public void onScissorsClickButton(View view){
        instructions.setText(game.getWinner(GameOption.SCISSORS.getName()));
        result.setText(game.getAllTotal());

    }
}
