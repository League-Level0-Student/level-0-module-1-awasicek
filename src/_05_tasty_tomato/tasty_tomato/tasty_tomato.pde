void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(255, 0, 0); // Make the tomato red.
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(0, 255, 0); // Make the stem green.
    rect(176, 103, 12, 32);
   
   if(mousePressed) { // Only bite the tomato when the mouse is pressed
     // Take a bite out of the tomato.
     fill(200, 200, 200);
     ellipse(75, 200, 35, 35);
   }
}
