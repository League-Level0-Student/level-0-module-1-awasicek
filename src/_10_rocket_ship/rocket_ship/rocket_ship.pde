int x = 400; 
int y = 600; 

void setup() {

    size(800, 800);

}

void draw() {
    background(0, 0, 40); 
    
    // moon
    fill(200, 200, 200);
    ellipse(100, 100, 75, 75);
    fill(0, 0, 40); 
    noStroke();
    ellipse(110, 110, 75, 75);
    
    // stars
    fill(255, 255, 180);
    // more complex polygons (actual stars) use beginShip ,endShape, vertex, PShape, etc.
    ellipse(500, 500, 3, 3);
    ellipse(700, 700, 3, 3);
    ellipse(400, 300, 3, 3);
    ellipse(570, 120, 3, 3);
    ellipse(175, 280, 3, 3);
    ellipse(120, 750, 3, 3);

    stroke(0);

    // rocket
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);

    // Change the code to make the rocket ship take off.
    y -= 3;
}
