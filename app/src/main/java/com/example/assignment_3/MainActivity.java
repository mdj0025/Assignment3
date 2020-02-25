package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveText();
            }
        });

    }

    public void saveText(){
        int id = 1;
        EditText noteToSave = findViewById(R.id.note);
        Note note = new Note(id,noteToSave.getText().toString());
        EditText ll = findViewById(R.id.noteLayout);
        EditText newNote = new EditText(this);
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        newNote.setLayoutParams(p);
        newNote.setText(noteToSave.getText());
        newNote.setId(id + 1);
        ll.setText(ll.getText() + "\n" + newNote.getText());
        id++;
    }
}
