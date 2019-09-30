
void setup() {
  size(1200, 800);

  PImage face = loadImage("face.jpg");
  face.resize(1200, 800);
  background(face);
}
void draw() {
  fill((mouseX / 5) + 100, (mouseY / 5) + 100, 100);
  ellipse(500, 380, 100, 75);
  ellipse(700, 380, 100, 75);
  
  // pupils
  fill(0, 0, 0);
  ellipse(500, 380, 10, 10);
  ellipse(700, 380, 10, 10);
}
