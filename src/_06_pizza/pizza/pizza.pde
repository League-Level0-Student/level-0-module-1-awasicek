// To play a sound when you add a topping.... 
// First download a sound from freesound.org and drop it onto your sketch 
// Import the minim library Pocessing > tools > add tools > libraries (search minim)
import ddf.minim.*;
Minim minim;
AudioPlayer sound;  

// teacher note: things like the bit-depth of the audio file can cause errors/failures

void setup() {
    minim = new Minim(this);
    sound = minim.loadFile("squelch.wav");
    
    // Set your canvas size
    size(800, 800);
    
    // draw the pizza in the setup so that the toppings can be added via mouse click
    
    // background
    PImage pizzaBox = loadImage("pizza_box.jpg");
    pizzaBox.resize(800, 800);
    background(pizzaBox);
  
    // Draw a biscuit colored ellipse for the pizza base, 
    // a red ellipse for sauce and a yellow ellipse inside (for the cheese). 
    // Do this in the setup method. You can use R,G,B values or the Processing Color Selector Tool 
    // to help you find the right colors.
    fill(#F7DD87);
    ellipse(400, 400, 510, 510); // base
    fill(#F26738);
    ellipse(400, 400, 480, 480); // sauce
    fill(#FCFCB8);
    ellipse(400, 400, 460, 460); // cheese
}
void draw() {

    
    // Get a topping for your pizza.
    // Save the image, drop the file onto your sketch, load the topping image (in draw method)
    PImage pepperoni = loadImage("pepperoni.png");
    PImage sardines = loadImage("sardines.png");
    pepperoni.resize(40, 40); // Resize
    sardines.resize(40, 40);
   
    if (mousePressed && mouseButton == LEFT) { // Add the toppings where the user clicks the mouse (in draw method)
      image(pepperoni, mouseX, mouseY);
      sound.play();
      sound.rewind();
    } else if (mousePressed) {
      image(sardines, mouseX, mouseY);
      sound.play();
      sound.rewind();
    }
}
