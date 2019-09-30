// Use the code below to print “ice cream ice cream ice cream banana” to the screen. 
// However, you can only use the words "ice cream" once in your code

void setup() {
  size(200, 200);
  background(#F238E6);
}

void draw() {
  String displayText = "ice cream";
  textSize(18);
  int yPos = 50;
  for(int i = 0; i < 4; i++) {
    if (i == 3) displayText = "banana";
    text(displayText, 50, yPos);
    yPos += 20;
  }
}
