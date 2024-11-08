import java.util.Random;
import javalib.funworld.*;
import javalib.worldimages.*;
import java.awt.Color;
import tester.*;

// represents a list of color
interface ILoColor {

  // finds length of list
  int length();

  // draws the list of colors onto the scene
  WorldImage draw();

  // removes the oldest color from the list
  ILoColor removeOne();

  // adds a new color to the front of the list
  ILoColor addColor(int keyInt, ILoColor colorChoices);

  // finds the color at a given index
  Color findColor(int keyInt);

  // the amount of exactly right colors
  int wordleGreens(ILoColor correctGuess);

  // compares the first with the other first, then recurs wordleGreens
  int greensHelper(Color thatFirst, ILoColor thatRest);

  // the amount of colors that are in the right answer but not in the right spot
  int wordleYellows(ILoColor correctGuess);

  // checks if the given color is in the list
  int inList(Color thatFirst);

  // recurs inlist with all colors in the guess
  int yellowHelper(ILoColor correctGuess);
  
  // generates a new random seqence of colors
  ILoColor correctSeqGenerator(Random rand, boolean dupes, int newLength);
  
  // removes a given color from a list of color
  ILoColor removeColor(Color c);

}

// represents an empty list of colors
class MtLoColor implements ILoColor {
  // CONSTRUCTOR
  MtLoColor() {
  }

  /* [TEMPLATE]
   * methods of this:
   *  this.length() ... int
   *  this.removeOne() ... ILoColor
   *  this.addColor() ... ILoColor
   *  this.findColor() ... Color
   *  this.wordleGreens() ... int
   *  this.greensHelper() ... int
   *  this.wordleYellows() ... int
   *  this.yellowHelper() ... int
   *  this.inList() ... int
   *  this.draw() ... WorldImage
   *  this.correctSeqGenerator() ... ILoColor
   *  this.removeColor() ... ILoColor
   */

  
  // returns 0, length of list
  @Override
  public int length() {
    return 0;
  }

  // removes one from the list, nothing to remove
  public ILoColor removeOne() {
    return new MtLoColor();
  }

  // adds the first color from colorchoices to a list of color
  public ILoColor addColor(int keyInt, ILoColor colorChoices) {
    
    /* [TEMPLATE]
     * fields of this:
     *  this.first ... String
     *  this.rest ... ILoString
     * methods of this:
     *  this.length() ... int
     *  this.removeOne() ... ILoColor
     *  this.addColor() ... ILoColor
     *  this.findColor() ... Color
     *  this.wordleGreens() ... int
     *  this.greensHelper() ... int
     *  this.wordleYellows() ... int
     *  this.yellowHelper() ... int
     *  this.inList() ... int
     *  this.draw() ... WorldImage
     *  this.correctSeqGenerator() ... ILoColor
     *  this.removeColor() ... ILoColor
     * methods of fields of this:
     *  this.length() ... int
     *  this.removeOne() ... ILoColor
     *  this.addColor() ... ILoColor
     *  this.findColor() ... Color
     *  this.wordleGreens() ... int
     *  this.greensHelper() ... int
     *  this.wordleYellows() ... int
     *  this.yellowHelper() ... int
     *  this.inList() ... int
     *  this.draw() ... WorldImage
     *  this.correctSeqGenerator() ... ILoColor
     *  this.removeColor() ... ILoColor
     */
    
    return new ConsLoColor(colorChoices.findColor(keyInt), new MtLoColor());
  }

  // cannot find a color in an empty list, throw exception
  public Color findColor(int keyInt) {
    throw new IllegalArgumentException("No color found at this index (empty list)");
  }

  // counts the amount of matching colors, returns 0
  public int wordleGreens(ILoColor correctGuess) {
    
    /* [TEMPLATE]
     * fields of this:
     *  this.first ... String
     *  this.rest ... ILoString
     * methods of this:
     *  this.length() ... int
     *  this.removeOne() ... ILoColor
     *  this.addColor() ... ILoColor
     *  this.findColor() ... Color
     *  this.wordleGreens() ... int
     *  this.greensHelper() ... int
     *  this.wordleYellows() ... int
     *  this.yellowHelper() ... int
     *  this.inList() ... int
     *  this.draw() ... WorldImage
     *  this.correctSeqGenerator() ... ILoColor
     *  this.removeColor() ... ILoColor
     * methods of fields of this:
     *  this.length() ... int
     *  this.removeOne() ... ILoColor
     *  this.addColor() ... ILoColor
     *  this.findColor() ... Color
     *  this.wordleGreens() ... int
     *  this.greensHelper() ... int
     *  this.wordleYellows() ... int
     *  this.yellowHelper() ... int
     *  this.inList() ... int
     *  this.draw() ... WorldImage
     *  this.correctSeqGenerator() ... ILoColor
     *  this.removeColor() ... ILoColor
     */
    
    return 0;
  }

  // recurs to check the amount of matching colors, returns 0
  public int greensHelper(Color thatFirst, ILoColor thatRest) {
    
    /* [TEMPLATE]
     * fields of this:
     *  this.first ... String
     *  this.rest ... ILoString
     * methods of this:
     *  this.length() ... int
     *  this.removeOne() ... ILoColor
     *  this.addColor() ... ILoColor
     *  this.findColor() ... Color
     *  this.wordleGreens() ... int
     *  this.greensHelper() ... int
     *  this.wordleYellows() ... int
     *  this.yellowHelper() ... int
     *  this.inList() ... int
     *  this.draw() ... WorldImage
     *  this.correctSeqGenerator() ... ILoColor
     *  this.removeColor() ... ILoColor
     * methods of fields of this:
     *  this.length() ... int
     *  this.removeOne() ... ILoColor
     *  this.addColor() ... ILoColor
     *  this.findColor() ... Color
     *  this.wordleGreens() ... int
     *  this.greensHelper() ... int
     *  this.wordleYellows() ... int
     *  this.yellowHelper() ... int
     *  this.inList() ... int
     *  this.draw() ... WorldImage
     *  this.correctSeqGenerator() ... ILoColor
     *  this.removeColor() ... ILoColor
     */
    
    return 0;
  }

  // counts the amount of inexact matches in correctGuess, returns 0
  public int wordleYellows(ILoColor correctGuess) {
    
    /* [TEMPLATE]
     * fields of this:
     *  this.first ... String
     *  this.rest ... ILoString
     * methods of this:
     *  this.length() ... int
     *  this.removeOne() ... ILoColor
     *  this.addColor() ... ILoColor
     *  this.findColor() ... Color
     *  this.wordleGreens() ... int
     *  this.greensHelper() ... int
     *  this.wordleYellows() ... int
     *  this.yellowHelper() ... int
     *  this.inList() ... int
     *  this.draw() ... WorldImage
     *  this.correctSeqGenerator() ... ILoColor
     *  this.removeColor() ... ILoColor
     * methods of fields of this:
     *  this.length() ... int
     *  this.removeOne() ... ILoColor
     *  this.addColor() ... ILoColor
     *  this.findColor() ... Color
     *  this.wordleGreens() ... int
     *  this.greensHelper() ... int
     *  this.wordleYellows() ... int
     *  this.yellowHelper() ... int
     *  this.inList() ... int
     *  this.draw() ... WorldImage
     *  this.correctSeqGenerator() ... ILoColor
     *  this.removeColor() ... ILoColor
     */
    
    return 0;
  }

  // recurs to check the amount of inexact matches in correctGuess using inList, returns 0
  public int yellowHelper(ILoColor correctGuess) {
    
    /* [TEMPLATE]
     * fields of this:
     *  this.first ... String
     *  this.rest ... ILoString
     * methods of this:
     *  this.length() ... int
     *  this.removeOne() ... ILoColor
     *  this.addColor() ... ILoColor
     *  this.findColor() ... Color
     *  this.wordleGreens() ... int
     *  this.greensHelper() ... int
     *  this.wordleYellows() ... int
     *  this.yellowHelper() ... int
     *  this.inList() ... int
     *  this.draw() ... WorldImage
     *  this.correctSeqGenerator() ... ILoColor
     *  this.removeColor() ... ILoColor
     * methods of fields of this:
     *  this.length() ... int
     *  this.removeOne() ... ILoColor
     *  this.addColor() ... ILoColor
     *  this.findColor() ... Color
     *  this.wordleGreens() ... int
     *  this.greensHelper() ... int
     *  this.wordleYellows() ... int
     *  this.yellowHelper() ... int
     *  this.inList() ... int
     *  this.draw() ... WorldImage
     *  this.correctSeqGenerator() ... ILoColor
     *  this.removeColor() ... ILoColor
     */
    
    return 0;
  }

  // checks if the given color is in the list
  public int inList(Color thatFirst) {
    return 0;
  }

  // draws an empty list of colors, so draws nothing
  public WorldImage draw() {
    return new EmptyImage();
  }

  // generates a seqenece, this is base case to end list
  public ILoColor correctSeqGenerator(Random rand, boolean dupes, int newLength) {
    return new MtLoColor();
  }
  
  // removes a color from a list, no colors in empty list so returns Mt
  public ILoColor removeColor(Color c) {
    return new MtLoColor();
  }

}

// represents a list of colors
class ConsLoColor implements ILoColor {
  Color first;
  ILoColor rest;

  // CONSTRUCTOR
  ConsLoColor(Color first, ILoColor rest) {
    this.first = first;
    this.rest = rest;
  }
  
  /* [TEMPLATE]
   * fields of this:
   *  this.first ... Color
   *  this.rest ... ILoColor
   * methods of this:
   *  this.length() ... int
   *  this.removeOne() ... ILoColor
   *  this.addColor() ... ILoColor
   *  this.findColor() ... Color
   *  this.wordleGreens() ... int
   *  this.greensHelper() ... int
   *  this.wordleYellows() ... int
   *  this.yellowHelper() ... int
   *  this.inList() ... int
   *  this.draw() ... WorldImage
   *  this.correctSeqGenerator() ... ILoColor
   *  this.removeColor() ... ILoColor
   * methods of fields of this:
   *  this.rest.length() ... int
   *  this.rest.removeOne() ... ILoColor
   *  this.rest.addColor() ... ILoColor
   *  this.rest.findColor() ... Color
   *  this.rest.wordleGreens() ... int
   *  this.rest.greensHelper() ... int
   *  this.rest.wordleYellows() ... int
   *  this.rest.yellowHelper() ... int
   *  this.rest.inList() ... int
   *  this.rest.draw() ... WorldImage
   *  this.rest.correctSeqGenerator() ... ILoColor
   *  this.rest.removeColor() ... ILoColor
   */


  // calculates length of list
  @Override
  public int length() {
    return 1 + this.rest.length();
  }

  // draws the seqence of colors in a row
  public WorldImage draw() {
    return (new BesideImage(new CircleImage(20, OutlineMode.SOLID, this.first), this.rest.draw()));
  }

  // removes the first from the list
  public ILoColor removeOne() {
    return this.rest;
  }

  // adds a color to the front of the list
  public ILoColor addColor(int keyInt, ILoColor colorChoices) {
    
    /* [TEMPLATE]
     * fields of colorChoices:
     *  colorChoices.first ... String
     *  colorChoices.rest ... ILoString
     * methods of colorChoices:
     *  colorChoices.length() ... int
     *  colorChoices.removeOne() ... ILoColor
     *  colorChoices.addColor() ... ILoColor
     *  colorChoices.findColor() ... Color
     *  colorChoices.wordleGreens() ... int
     *  colorChoices.greensHelper() ... int
     *  colorChoices.wordleYellows() ... int
     *  colorChoices.yellowHelper() ... int
     *  colorChoices.inList() ... int
     *  colorChoices.draw() ... WorldImage
     *  colorChoices.correctSeqGenerator() ... ILoColor
     *  colorChoices.removeColor() ... ILoColor
     * methods of fields of colorChoices:
     *  colorChoices.rest.length() ... int
     *  colorChoices.rest.removeOne() ... ILoColor
     *  colorChoices.rest.addColor() ... ILoColor
     *  colorChoices.rest.findColor() ... Color
     *  colorChoices.rest.wordleGreens() ... int
     *  colorChoices.rest.greensHelper() ... int
     *  colorChoices.rest.wordleYellows() ... int
     *  colorChoices.rest.yellowHelper() ... int
     *  colorChoices.rest.inList() ... int
     *  colorChoices.rest.draw() ... WorldImage
     *  colorChoices.rest.correctSeqGenerator() ... ILoColor
     *  colorChoices.rest.removeColor() ... ILoColor
     */
    
    return new ConsLoColor(colorChoices.findColor(keyInt), this);
  }

  // finds a color at a given index
  public Color findColor(int keyInt) {
    if (keyInt > 0) {
      return this.rest.findColor(keyInt - 1);
    } else {
      return this.first;
    }
  }

  // finds the amount of exact matches in two lists
  public int wordleGreens(ILoColor correctGuess) {
    
    /* [TEMPLATE]
     * fields of correctGuess:
     *  correctGuess.first ... String
     *  correctGuess.rest ... ILoString
     * methods of correctGuess:
     *  correctGuess.length() ... int
     *  correctGuess.removeOne() ... ILoColor
     *  correctGuess.addColor() ... ILoColor
     *  correctGuess.findColor() ... Color
     *  correctGuess.wordleGreens() ... int
     *  correctGuess.greensHelper() ... int
     *  correctGuess.wordleYellows() ... int
     *  correctGuess.yellowHelper() ... int
     *  correctGuess.inList() ... int
     *  correctGuess.draw() ... WorldImage
     *  correctGuess.correctSeqGenerator() ... ILoColor
     *  correctGuess.removeColor() ... ILoColor
     * methods of fields of correctGuess:
     *  correctGuess.rest.length() ... int
     *  correctGuess.rest.removeOne() ... ILoColor
     *  correctGuess.rest.addColor() ... ILoColor
     *  correctGuess.rest.findColor() ... Color
     *  correctGuess.rest.wordleGreens() ... int
     *  correctGuess.rest.greensHelper() ... int
     *  correctGuess.rest.wordleYellows() ... int
     *  correctGuess.rest.yellowHelper() ... int
     *  correctGuess.rest.inList() ... int
     *  correctGuess.rest.draw() ... WorldImage
     *  correctGuess.rest.correctSeqGenerator() ... ILoColor
     *  correctGuess.rest.removeColor() ... ILoColor
     */
    
    return correctGuess.greensHelper(this.first, this.rest);
  }

  // adds 1 if the first two in the list are the same and recurs rest
  public int greensHelper(Color thatFirst, ILoColor thatRest) {
    
    /* [TEMPLATE]
     * fields of thatRest:
     *  thatRest.first ... String
     *  thatRest.rest ... ILoString
     * methods of thatRest:
     *  thatRest.length() ... int
     *  thatRest.removeOne() ... ILoColor
     *  thatRest.addColor() ... ILoColor
     *  thatRest.findColor() ... Color
     *  thatRest.wordleGreens() ... int
     *  thatRest.greensHelper() ... int
     *  thatRest.wordleYellows() ... int
     *  thatRest.yellowHelper() ... int
     *  thatRest.inList() ... int
     *  thatRest.draw() ... WorldImage
     *  thatRest.correctSeqGenerator() ... ILoColor
     *  thatRest.removeColor() ... ILoColor
     * methods of fields of thatRest:
     *  thatRest.rest.length() ... int
     *  thatRest.rest.removeOne() ... ILoColor
     *  thatRest.rest.addColor() ... ILoColor
     *  thatRest.rest.findColor() ... Color
     *  thatRest.rest.wordleGreens() ... int
     *  thatRest.rest.greensHelper() ... int
     *  thatRest.rest.wordleYellows() ... int
     *  thatRest.rest.yellowHelper() ... int
     *  thatRest.rest.inList() ... int
     *  thatRest.rest.draw() ... WorldImage
     *  thatRest.rest.correctSeqGenerator() ... ILoColor
     *  thatRest.rest.removeColor() ... ILoColor
     */
    
    if (this.first.equals(thatFirst)) {
      return 1 + thatRest.wordleGreens(this.rest);
    } else {
      return thatRest.wordleGreens(this.rest);
    }
  }

  // finds the amount of inexact matches by calculating all matches - exact matches
  public int wordleYellows(ILoColor correctGuess) {
    
    /* [TEMPLATE]
     * fields of correctGuess:
     *  correctGuess.first ... String
     *  correctGuess.rest ... ILoString
     * methods of correctGuess:
     *  correctGuess.length() ... int
     *  correctGuess.removeOne() ... ILoColor
     *  correctGuess.addColor() ... ILoColor
     *  correctGuess.findColor() ... Color
     *  correctGuess.wordleGreens() ... int
     *  correctGuess.greensHelper() ... int
     *  correctGuess.wordleYellows() ... int
     *  correctGuess.yellowHelper() ... int
     *  correctGuess.inList() ... int
     *  correctGuess.draw() ... WorldImage
     *  correctGuess.correctSeqGenerator() ... ILoColor
     *  correctGuess.removeColor() ... ILoColor
     * methods of fields of correctGuess:
     *  correctGuess.rest.length() ... int
     *  correctGuess.rest.removeOne() ... ILoColor
     *  correctGuess.rest.addColor() ... ILoColor
     *  correctGuess.rest.findColor() ... Color
     *  correctGuess.rest.wordleGreens() ... int
     *  correctGuess.rest.greensHelper() ... int
     *  correctGuess.rest.wordleYellows() ... int
     *  correctGuess.rest.yellowHelper() ... int
     *  correctGuess.rest.inList() ... int
     *  correctGuess.rest.draw() ... WorldImage
     *  correctGuess.rest.correctSeqGenerator() ... ILoColor
     *  correctGuess.rest.removeColor() ... ILoColor
     */
    
    return this.yellowHelper(correctGuess) - this.wordleGreens(correctGuess);
  }

  // adds 1 if the color is in the list and recurs the rest
  public int yellowHelper(ILoColor correctGuess) {
    if (correctGuess.inList(this.first) == 1) {
      return correctGuess.inList(this.first) 
          + rest.yellowHelper(correctGuess.removeColor(this.first));
    }
    else {
      return correctGuess.inList(this.first) + this.rest.yellowHelper(correctGuess);
    }
  }

  // returns 1 if in the list, 0 if not, then recurs through the rest
  public int inList(Color thatFirst) {
    
    /* [TEMPLATE]
     * fields of correctGuess:
     *  correctGuess.first ... String
     *  correctGuess.rest ... ILoString
     * methods of correctGuess:
     *  correctGuess.length() ... int
     *  correctGuess.removeOne() ... ILoColor
     *  correctGuess.addColor() ... ILoColor
     *  correctGuess.findColor() ... Color
     *  correctGuess.wordleGreens() ... int
     *  correctGuess.greensHelper() ... int
     *  correctGuess.wordleYellows() ... int
     *  correctGuess.yellowHelper() ... int
     *  correctGuess.inList() ... int
     *  correctGuess.draw() ... WorldImage
     *  correctGuess.correctSeqGenerator() ... ILoColor
     *  correctGuess.removeColor() ... ILoColor
     * methods of fields of correctGuess:
     *  correctGuess.rest.length() ... int
     *  correctGuess.rest.removeOne() ... ILoColor
     *  correctGuess.rest.addColor() ... ILoColor
     *  correctGuess.rest.findColor() ... Color
     *  correctGuess.rest.wordleGreens() ... int
     *  correctGuess.rest.greensHelper() ... int
     *  correctGuess.rest.wordleYellows() ... int
     *  correctGuess.rest.yellowHelper() ... int
     *  correctGuess.rest.inList() ... int
     *  correctGuess.rest.draw() ... WorldImage
     *  correctGuess.rest.correctSeqGenerator() ... ILoColor
     *  correctGuess.rest.removeColor() ... ILoColor
     */
    
    if (this.first.equals(thatFirst)) {
      return 1;
    } else {
      return 0 + this.rest.inList(thatFirst);
    }
  }

  // generates a new random sequence that is used for correctGuess
  public ILoColor correctSeqGenerator(Random rand, boolean dupes, int newLength) {
    Color nextColor = this.findColor(rand.nextInt(this.length()));
    
    //dupes allowed
    if (newLength > 0 && dupes) {
      return new ConsLoColor(nextColor,
          this.correctSeqGenerator(rand, dupes, newLength - 1));
    } else if (newLength > 0 && !dupes) {
      
      // no dupes allowed
      return new ConsLoColor(nextColor,
          this.removeColor(nextColor).correctSeqGenerator(rand, dupes, newLength - 1));
    } else {
      return new MtLoColor();
    }
  }
  
  // removes a the first appearance of a color in the list
  public ILoColor removeColor(Color c) {
    if (this.first.equals(c)) {
      return this.rest;
    }
    else {
      return new ConsLoColor(this.first, this.rest.removeColor(c));
    }
  }
}

// represents a game and world state of the game
class Mastermind extends World {

  // given seed
  Random rand;

  // player given settings
  boolean dupes;
  int seqLength;
  int guessNum;
  ILoColor colorChoices;

  // world state
  ILoColor currentGuess = new MtLoColor();
  boolean win = false;
  boolean guessComplete = false;
  boolean uncover = false;
  int attempts = 0;
  int exact;
  int inexact;
  WorldImage pastGuesses = new EmptyImage();
  WorldImage exactInexactImage = new EmptyImage();
  ILoColor correctSeq;

  // CONSTRUCTOR
  Mastermind(boolean dupes, int seqLength, int guessNum, ILoColor colorChoices) {
    this(new Random(), dupes, seqLength, guessNum, colorChoices);
  }
  
  // RAND CONSTRUCTOR
  Mastermind(Random rand, boolean dupes, int seqLength, int guessNum, ILoColor colorChoices) {
    this(rand, dupes, seqLength, guessNum, colorChoices, 
        new MtLoColor());
  }
  
  // RAND CONSTRUCTOR for tests
  // rand, dupes, seqLength, guessNum, colorChoices, currentGuess, 
  // correctSeq
  Mastermind(Random rand, boolean dupes, int seqLength, int guessNum, ILoColor colorChoices, 
      ILoColor currentGuess) {
    
    // sequence length is 0 or negative
    if (seqLength <= 0) {
      throw new IllegalArgumentException("Sequence length is zero or negative");
    }

    // guess number is 0 or negative
    if (guessNum <= 0) {
      throw new IllegalArgumentException("Number of guesses are 0 or less than zero");
    }

    // the list of colors is 0
    if (colorChoices.length() == 0) {
      throw new IllegalArgumentException("The length of the list of Colors is zero");
    }

    // duplicates are not allowed, seqLength > loColor.length
    if (seqLength > colorChoices.length() && !dupes) {
      throw new IllegalArgumentException("Seqence is too long when duplicates not allowed");
    }

    //regular constructors
    this.rand = rand;
    this.dupes = dupes;
    this.seqLength = seqLength;
    this.guessNum = guessNum;
    this.colorChoices = colorChoices;
    
    //world state
    this.currentGuess = currentGuess;

    // generates the correct sequence to guess
    correctSeq = this.colorChoices.correctSeqGenerator(this.rand, dupes, seqLength);
  }
  
  /* [TEMPLATE]
  * fields of this:
  *  this.rand ... Random
  *  this.dupes ... boolean
  *  this.seqLength ... int
  *  this.guessNum ... int
  *  this.colorChoices ... ILoColor
  *  this.correctSeq ... ILoColor
  *  this.currentGuess ... ILoColor
  *  this.win ... boolean
  *  this.guessComplete ... boolean
  *  this.uncover ... boolean
  *  this.attempts ... int
  *  this.exact ... int
  *  this.inexact ... int
  *  this.pastGuess ... WorldImage
  *  this.exactInexactImage ... WorldImage
  * methods of this:
  *  this.colorChoices.length() ... int
  *  this.colorChoices.removeOne() ... ILoColor
  *  this.colorChoices.addColor() ... ILoColor
  *  this.colorChoices.findColor() ... Color
  *  this.colorChoices.wordleGreens() ... int
  *  this.colorChoices.greensHelper() ... int
  *  this.colorChoices.wordleYellows() ... int
  *  this.colorChoices.yellowHelper() ... int
  *  this.colorChoices.inList() ... int
  *  this.colorChoices.draw() ... WorldImage
  *  this.colorChoices.correctSeqGenerator() ... ILoColor
  *  this.colorChoices.removeColor() ... ILoColor
  *  this.correctSeq.length() ... int
  *  this.correctSeq.removeOne() ... ILoColor
  *  this.correctSeq.addColor() ... ILoColor
  *  this.correctSeq.findColor() ... Color
  *  this.correctSeq.wordleGreens() ... int
  *  this.correctSeq.greensHelper() ... int
  *  this.correctSeq.wordleYellows() ... int
  *  this.correctSeq.yellowHelper() ... int
  *  this.correctSeq.inList() ... int
  *  this.correctSeq.draw() ... WorldImage
  *  this.correctSeq.correctSeqGenerator() ... ILoColor
  *  this.correctSeq.removeColor() ... ILoColor
  *  this.currentGuess.length() ... int
  *  this.currentGuess.removeOne() ... ILoColor
  *  this.currentGuess.addColor() ... ILoColor
  *  this.currentGuess.findColor() ... Color
  *  this.currentGuess.wordleGreens() ... int
  *  this.currentGuess.greensHelper() ... int
  *  this.currentGuess.wordleYellows() ... int
  *  this.currentGuess.yellowHelper() ... int
  *  this.currentGuess.inList() ... int
  *  this.currentGuess.draw() ... WorldImage
  *  this.currentGuess.correctSeqGenerator() ... ILoColor
  *  this.currentGuess.removeColor() ... ILoColor
  */
  
  // modify the current world based on keys pressed
  public World onKeyEvent(String key) {
    //if number
    if ("123456789".contains(key)) {
      int keyInt = Integer.parseInt(key);
      if (keyInt > this.colorChoices.length()) {
        return this;
      } else if ((keyInt <= colorChoices.length()) && (keyInt > 0) 
          && (this.seqLength > this.currentGuess.length())) {
        // add the newly inputted color to the current guess
        this.currentGuess = this.currentGuess.addColor(keyInt - 1, this.colorChoices);
        return this;
      }
      return this;
    }
    
    // if backspace
    if (key.equals("backspace")) {
      // removes most recent color entered, move back to that spot
      this.currentGuess = this.currentGuess.removeOne();
      return this;
      //if enter
    } else if ((key.equals("enter")) && (this.seqLength == this.currentGuess.length())) {
      return this.submitGuess(); // submit attempt ONLY if sequence is full
    } else {
      return this;
    }
  }

  // submits a guess and checks if the guess is correct, leads to win, loss, or continue
  public Mastermind submitGuess() {

    // wordle greens
    int exact = this.currentGuess.wordleGreens(this.correctSeq);

    // wordle yellows
    int inexact = this.currentGuess.wordleYellows(this.correctSeq);
    
    // correct answer
    if (exact == seqLength) {
      this.guessNum -= 1;
      this.exact = exact;
      this.inexact = inexact;
      
      // save the past guesses in one WorldImage
      this.pastGuesses = new AboveImage(this.pastGuesses, this.currentGuess.draw());
      
      // save the past exact and inexacts into one WorldImage with new exacts and inexacts
      this.exactInexactImage = new AboveImage(new OverlayImage(
          new OverlayOffsetImage(new TextImage("" + this.exact, 20, Color.black), 100, 0,
              new TextImage("" + this.inexact, 20, Color.black)),
          new RectangleImage(100, 40, OutlineMode.SOLID, Color.white)), this.exactInexactImage);
      this.win = true;
      return this;
      
      // wrong answer
    } else if (this.guessNum == 1) {
      
      //update the world
      this.guessNum -= 1;
      this.exact = exact;
      this.inexact = inexact;
      
      // save the past guesses in one WorldImage
      this.pastGuesses = new AboveImage(this.pastGuesses, this.currentGuess.draw());
      
      // save the past exact and inexacts into one WorldImage with new exacts and inexacts
      this.exactInexactImage = new AboveImage(new OverlayImage(
          new OverlayOffsetImage(new TextImage("" + this.exact, 20, Color.black), 100, 0,
              new TextImage("" + this.inexact, 20, Color.black)),
          new RectangleImage(100, 40, OutlineMode.SOLID, Color.white)), this.exactInexactImage);
      return this;
      
      // wrong answer, still more attempts
    } else {
      
      //update world state
      this.guessNum -= 1;
      this.guessComplete = true;
      this.exact = exact;
      this.inexact = inexact;

      // save the past guesses in one WorldImage
      this.pastGuesses = new AboveImage(this.pastGuesses, this.currentGuess.draw());
      
      // save the past exact and inexacts into one WorldImage with new exacts and inexacts
      this.exactInexactImage = new AboveImage(new OverlayImage(
          new OverlayOffsetImage(new TextImage("" + this.exact, 20, Color.black), 100, 0,
              new TextImage("" + this.inexact, 20, Color.black)),
          new RectangleImage(100, 40, OutlineMode.SOLID, Color.white)), this.exactInexactImage);
      
      this.currentGuess = new MtLoColor();
      this.attempts += 1;
      return this;
    }
  }

  // displays the world scene on each tick
  public WorldScene makeScene() {
    // Set scene dimensions
    int width = 1000;
    int height = 1000;

    // create a blank scene
    WorldScene scene = new WorldScene(width, height);

    // draw the remaining guesses
    WorldImage guessesLeft = new TextImage("Guesses Left: " + this.guessNum, 20, Color.BLACK);
    // Place text at the top
    scene = scene.placeImageXY(guessesLeft, width / 2, 20); 
    
    // draw the correct sequence for testing purposes (can be removed later)
    WorldImage correctSeqText = new TextImage("Correct Sequence: ", 20, Color.BLACK);
    WorldImage correctSeqDraw = new RotateImage(this.correctSeq.draw(), 180);
    scene = scene.placeImageXY(correctSeqText, width / 2, 50);
    // Display the correct sequence
    scene = scene.placeImageXY(correctSeqDraw, width / 2, 90); 
    
    // cover the winning seqence at the top
    if (!this.uncover) {
      WorldImage correctSeqBlocker = new RectangleImage(40 * this.seqLength
          + 60, 80, OutlineMode.SOLID, Color.white);
      scene = scene.placeImageXY(correctSeqBlocker, width / 2, 70);
    }
    
    // draw the current guess (the player's ongoing guess)
    WorldImage currentGuessText = new TextImage("Current Guess: ", 20, Color.BLACK);
    WorldImage currentGuessDraw = new RotateImage(this.currentGuess.draw(), 180);
    scene = scene.placeImageXY(currentGuessText, width / 2, 570);
    // Display the current guess
    scene = scene.placeImageXY(currentGuessDraw, width / 2, 610); 

    // draw the available color choices (palette for the player to choose from)
    WorldImage colorChoicesImage = new TextImage("Available Colors: ", 20, Color.BLACK);
    WorldImage colorChoicesDraw = this.colorChoices.draw();
    scene = scene.placeImageXY(colorChoicesImage, width / 2, 675);
    // Display color choices
    scene = scene.placeImageXY(colorChoicesDraw, width / 2, 725); 
    
    // place the past guesses above the current guess
    WorldImage pastGuessesImage = new RotateImage(this.pastGuesses, 180);
    // Display the current guess
    scene = scene.placeImageXY(pastGuessesImage, width / 2, 530 - (this.attempts * 20)); 
    
    // place the exact and inexact right next to the pastGuessesImage
    scene = scene.placeImageXY(this.exactInexactImage, width * 7 / 9, 530 - (this.attempts * 20));
    
    //display the column for exact and inexact at the top
    WorldImage exactInexactColumn = new OverlayOffsetImage(new TextImage("Exact", 20, Color.black), 
        100, 0, 
        new TextImage("Inexact", 20, Color.black));
    scene = scene.placeImageXY(exactInexactColumn, width * 7 / 9 + 10, 20);
    
    // win or loss screen
    if (this.win) {
      WorldImage endScreen = new TextImage("You Win!", 50, Color.BLACK);
      this.currentGuess = new MtLoColor();
      scene = scene.placeImageXY(endScreen, width / 6, 50);
      this.uncover = true;
      return scene;
    } else if (!this.win && guessNum < 1) {
      WorldImage endScreen = new TextImage("You Lose...", 50, Color.BLACK);
      this.currentGuess = new MtLoColor();
      scene = scene.placeImageXY(endScreen, width / 6, 50);
      this.uncover = true;
      return scene;
    }
    
    return scene;
  }
}

// represents examples of the mastermind game, colors, lists of colors, and tests
class ExamplesMasterminds {

  //random with key, for correctSeqGenerator, testSubmitGuess, testMakeScene, onKeyEvent
  Random rand = new Random(1);
  
  // example lists of colors
  ILoColor emptyC = new MtLoColor();

  ILoColor listColorR = new ConsLoColor(Color.red, emptyC);
  
  ILoColor listColorG = new ConsLoColor(Color.green, emptyC);
 
  ILoColor listColorB = new ConsLoColor(Color.blue, emptyC);
 
  ILoColor listColorGR = new ConsLoColor(Color.green,
      new ConsLoColor(Color.red, emptyC));
 
  ILoColor listColorRG = new ConsLoColor(Color.red,
      new ConsLoColor(Color.green, emptyC));
 
  ILoColor listColorGB = new ConsLoColor(Color.green, 
      new ConsLoColor(Color.blue, emptyC));
  
  ILoColor listColorBGR = new ConsLoColor(Color.blue,
      new ConsLoColor(Color.green, 
          new ConsLoColor(Color.red, emptyC)));
  
  ILoColor listColorRGB = new ConsLoColor(Color.red,
      new ConsLoColor(Color.green, new ConsLoColor(Color.blue, emptyC)));
  
  ILoColor listColorRRR = new ConsLoColor(Color.red,
      new ConsLoColor(Color.red, new ConsLoColor(Color.red, emptyC)));
   
  ILoColor listColorGGB = new ConsLoColor(Color.green,
      new ConsLoColor(Color.green, new ConsLoColor(Color.blue, emptyC)));
  
  ILoColor listColorBRG = new ConsLoColor(Color.blue,
      new ConsLoColor(Color.red, new ConsLoColor(Color.green, emptyC)));
  
  ILoColor listColorEverything = new ConsLoColor(Color.blue,
      new ConsLoColor(Color.green,
          new ConsLoColor(Color.red,
              new ConsLoColor(Color.pink,
                  new ConsLoColor(Color.black, 
                      new ConsLoColor(Color.gray, 
                          new ConsLoColor(Color.MAGENTA,
                              new ConsLoColor(Color.LIGHT_GRAY, 
                                  new ConsLoColor(Color.orange, 
                                      new MtLoColor())))))))));
  
  ILoColor rainbow = new ConsLoColor(Color.red,
      new ConsLoColor(Color.orange,
          new ConsLoColor(Color.yellow,
              new ConsLoColor(Color.green,
                  new ConsLoColor(Color.blue, 
                      new ConsLoColor(Color.magenta, new MtLoColor()))))));
  
  //Example worlds for correctSeqGenerator, testSubmitGuess, testMakeScene, onKeyEvent
  World dupeMastermind = new Mastermind(this.rand, true, 3, 5, this.listColorBGR);
  World noDupeMastermind = new Mastermind(this.rand, false, 3, 5, this.listColorBGR);

  //wordleYellow tests
  boolean testwordleYellow(Tester t) {
    return t.checkExpect(this.emptyC.wordleYellows(this.emptyC), 0) 
        && t.checkExpect(this.listColorR.wordleYellows(this.listColorR), 0)
        && t.checkExpect(this.listColorG.wordleYellows(this.listColorR), 0)
        && t.checkExpect(this.listColorR.wordleYellows(this.listColorGR), 1)
        && t.checkExpect(this.listColorB.wordleYellows(this.listColorGR), 0)
        && t.checkExpect(this.listColorRG.wordleYellows(this.listColorGR), 2)
        && t.checkExpect(this.listColorRG.wordleYellows(this.listColorEverything), 1);
  }

  //BIG BANG SETTINGS ------------------------------------------------------
  boolean testBigBang(Tester t) {
    Mastermind w = new Mastermind(false, 3, 5, this.listColorRGB);
    int worldWidth = 1000;
    int worldHeight = 1000;
    double tickRate = 1;
    return w.bigBang(worldWidth, worldHeight, tickRate);
  }
  
  // tests if the method saves all of the mastermind settings
  boolean testCons1(Tester t) {
    
    //IAE messages
    String seqException = "Sequence length is zero or negative";
    String guessNumException = "Number of guesses are 0 or less than zero";
    String listLengthException = "The length of the list of Colors is zero";
    String tooLongNoDupes = "Seqence is too long when duplicates not allowed";
    
    
    //sequence too long
    return t.checkConstructorException(new IllegalArgumentException(seqException), 
        "Mastermind", true, -1, 10, this.rainbow)
        
        //guessnumber is 0 or less
        && t.checkConstructorException(new IllegalArgumentException(guessNumException), 
            "Mastermind", true, 3, 0, this.rainbow)
        
        //list length is 0
        && t.checkConstructorException(new IllegalArgumentException(listLengthException), 
            "Mastermind", true, 3, 10, this.emptyC)
        
        //sequence is too long for amount of colors without dupes
        && t.checkConstructorException(new IllegalArgumentException(tooLongNoDupes), 
            "Mastermind", false, 3, 10, this.listColorR);
  }
  
  // tests if the method saves a rand, might not need a tester method
  boolean testCons2(Tester t) {
    
    //IAE messages
    Random rand = new Random(1);
    String seqException = "Sequence length is zero or negative";
    String guessNumException = "Number of guesses are 0 or less than zero";
    String listLengthException = "The length of the list of Colors is zero";
    String tooLongNoDupes = "Seqence is too long when duplicates not allowed";
    
    //sequence too long
    return t.checkConstructorException(new IllegalArgumentException(seqException), 
        "Mastermind", rand, true, -1, 10, this.rainbow)
        
        //guessnumber is 0 or less
        && t.checkConstructorException(new IllegalArgumentException(guessNumException), 
            "Mastermind", rand, true, 3, 0, this.rainbow)
        
        //list length is 0
        && t.checkConstructorException(new IllegalArgumentException(listLengthException), 
            "Mastermind", rand, true, 3, 10, this.emptyC)
        
        //sequence is too long for amount of colors without dupes
        && t.checkConstructorException(new IllegalArgumentException(tooLongNoDupes), 
            "Mastermind", rand, false, 3, 10, this.listColorR);
  }
  
  // tests the tester method with a lot of extra parameters
  // rand, dupes, seqLength, guessNum, colorChoices, currentGuess
  boolean testCons3(Tester t) {
    
    //IAE messages
    Random rand = new Random(1);
    String seqException = "Sequence length is zero or negative";
    String guessNumException = "Number of guesses are 0 or less than zero";
    String listLengthException = "The length of the list of Colors is zero";
    String tooLongNoDupes = "Seqence is too long when duplicates not allowed";
    
    //sequence too long
    return t.checkConstructorException(new IllegalArgumentException(seqException), 
        "Mastermind", rand, true, -1, 10, this.rainbow, this.listColorBGR)
        
        //guessnumber is 0 or less
        && t.checkConstructorException(new IllegalArgumentException(guessNumException), 
            "Mastermind", rand, true, 3, 0, this.rainbow, this.listColorBGR)
        
        //list length is 0
        && t.checkConstructorException(new IllegalArgumentException(listLengthException), 
            "Mastermind", rand, true, 3, 10, this.emptyC, this.listColorBGR)
        
        //sequence is too long for amount of colors without dupes
        && t.checkConstructorException(new IllegalArgumentException(tooLongNoDupes), 
            "Mastermind", rand, false, 3, 10, this.listColorR, this.listColorBGR);
  }
  
  // tests if the method finds length of list
  boolean testLength(Tester t) {
    
    //finds the length of a empty list
    return t.checkExpect(this.emptyC.length(), 0)
        
        //finds the length of a one element list
        && t.checkExpect(this.listColorR.length(), 1)
        
        //finds the length of a long list, test recursion
        && t.checkExpect(this.listColorEverything.length(), 9);
  }

  // tests if the method draws the list of colors onto the scene
  boolean testDraw(Tester t) {
    
    //draws an empty list of colors
    return t.checkExpect(this.emptyC.draw(), new EmptyImage())
        
        //draws a list of just red, one circle image
        && t.checkExpect(this.listColorR.draw(), 
            new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.red), new EmptyImage()))
        
        //draws a 6 length list, test recursion
        && t.checkExpect(this.rainbow.draw(), 
            new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.red),
                new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.orange),
                    new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.yellow),
                        new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.green), 
                            new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.blue),
                                new BesideImage(new CircleImage(20, OutlineMode.SOLID, 
                                    Color.magenta), 
                                    new EmptyImage())))))));
  }

  // tests if the method removes the newest color from the list
  boolean testRemoveOne(Tester t) {
    
    //remove one from an empty list, stays empty
    return t.checkExpect(this.emptyC.removeOne(), new MtLoColor())
        
        //remove one from a list with one, returns an empty lsit
        && t.checkExpect(this.listColorR.removeOne(), new MtLoColor())
        
        //remove one from the list of 9, returns a list of 8
        && t.checkExpect(this.listColorEverything.removeOne(), 
            new ConsLoColor(Color.green,
                new ConsLoColor(Color.red,
                    new ConsLoColor(Color.pink,
                        new ConsLoColor(Color.black, 
                            new ConsLoColor(Color.gray, 
                                new ConsLoColor(Color.MAGENTA,
                                    new ConsLoColor(Color.LIGHT_GRAY, 
                                        new ConsLoColor(Color.orange, 
                                            new MtLoColor())))))))));
  }

  // tests if the method adds a new color to the front of the list
  boolean testAddColor(Tester t) {
    
    //adds a color to an empty lsit
    return t.checkExpect(this.emptyC.addColor(0, this.listColorR), this.listColorR)
        
        //adds a color to a list with a color
        && t.checkExpect(this.listColorR.addColor(1, this.listColorRG), this.listColorGR)
        
        //adds a color to a list with a color with a full list to test recursion
        && t.checkExpect(this.listColorEverything.addColor(8, this.listColorEverything), 
            new ConsLoColor(Color.orange, this.listColorEverything));
  }

  // tests if the method finds the color at a given index
  boolean testFindColor(Tester t) {
    
    //IAE messages
    String outOfBounds = "No color found at this index (empty list)";
    
    //test out of founds for empty case
    return t.checkException(new IllegalArgumentException(outOfBounds), 
        this.emptyC, "findColor", 0)
        
        //test out of bounds for right side
        && t.checkException(new IllegalArgumentException(outOfBounds), 
            this.rainbow, "findColor", 100)
        
        //find a color at an index, testing recursion
        && t.checkExpect(this.listColorEverything.findColor(8), Color.orange);
  }

  // tests if the method counts the amount of exactly right colors
  boolean testWordleGreens(Tester t) {
    
    // empty case color
    return t.checkExpect(this.emptyC.wordleGreens(this.listColorR), 0)
        
        // empty case empty
        && t.checkExpect(this.emptyC.wordleGreens(this.emptyC), 0)
        
        // non-nested perfect match
        && t.checkExpect(this.listColorR.wordleGreens(this.listColorR), 1)
        
        // non-nested no match
        && t.checkExpect(this.listColorR.wordleGreens(this.listColorG), 0)
        
        // nested perfect match
        && t.checkExpect(this.listColorRG.wordleGreens(this.listColorRG), 2)
        
        // nested semi match
        && t.checkExpect(this.listColorRGB.wordleGreens(this.listColorBGR), 1)
        
        // nested no match
        && t.checkExpect(this.listColorRRR.wordleGreens(this.listColorGGB), 0);
  }

  // tests if the method compares the first with the other first, then recurs wordleGreens
  boolean testGreensHelper(Tester t) {
    
    // empty case color
    return t.checkExpect(this.emptyC.greensHelper(Color.blue, this.listColorBGR), 0)
        
        // empty case empty
        && t.checkExpect(this.emptyC.greensHelper(Color.red, this.emptyC), 0)
        
        // test non-nested + non-nested match
        && t.checkExpect(this.listColorR.greensHelper(Color.red, this.emptyC), 1)
        
        // test non-nested + non-nested not
        && t.checkExpect(this.listColorR.greensHelper(Color.blue, this.emptyC), 0)
        
        // test non-nested + nested match exact
        && t.checkExpect(this.listColorB.greensHelper(Color.blue, this.listColorRG), 1)
        
        // test non-nested + nested match not exact
        && t.checkExpect(this.listColorR.greensHelper(Color.yellow, this.listColorRG), 0)
        
        // test nested + non-nested match exact
        && t.checkExpect(this.listColorRGB.greensHelper(Color.red, this.emptyC), 1)
        
        // test nested + non-nested match not exact
        && t.checkExpect(this.listColorRGB.greensHelper(Color.blue, this.emptyC), 0)
        
        // test nested + nested match exact
        && t.checkExpect(this.listColorRGB.greensHelper(Color.red, this.listColorGB), 3)
        
        // test nested + nested match semi exact
        && t.checkExpect(this.listColorBGR.greensHelper(Color.blue, this.listColorRG), 1)
        
        // test nested + nested match no exact
        && t.checkExpect(this.listColorRGB.greensHelper(Color.blue, this.listColorRG), 0);
  }

  // tests if the method counts the amount of colors that are in the right answer 
  // but not in the right spot
  boolean testWordleYellows(Tester t) {
    
    // empty case color
    return t.checkExpect(this.emptyC.wordleYellows(this.listColorR), 0)
        
        // empty case empty
        && t.checkExpect(this.emptyC.wordleYellows(this.emptyC), 0)
        
        // non-nested perfect match
        && t.checkExpect(this.listColorR.wordleYellows(this.listColorR), 0)
        
        // non-nested no match
        && t.checkExpect(this.listColorR.wordleYellows(this.listColorG), 0)
        
        // nested perfect match
        && t.checkExpect(this.listColorRG.wordleYellows(this.listColorRG), 0)
        
        // nested semi match
        && t.checkExpect(this.listColorRGB.wordleYellows(this.listColorBGR), 2)
        
        // nested jumbled match
        && t.checkExpect(this.listColorRGB.wordleYellows(this.listColorBRG), 3)
        
        // nested no match
        && t.checkExpect(this.listColorRRR.wordleYellows(this.listColorGGB), 0);
  }

  // tests if the method recurs inlist with all colors in the guess
  boolean testYellowHelper(Tester t) {
    
    // empty case
    return t.checkExpect(this.emptyC.yellowHelper(this.emptyC), 0)
        
        // empty case with not empty
        && t.checkExpect(this.emptyC.yellowHelper(this.listColorBGR), 0)
        
        // test nested all colors are shared between lists
        && t.checkExpect(this.listColorRGB.yellowHelper(this.listColorBGR), 3)
        
        // tests nested no shared colors between lists
        && t.checkExpect(this.listColorGGB.yellowHelper(this.listColorRRR), 0)
        
        // tests nested some shared colors between lists
        && t.checkExpect(this.listColorBGR.yellowHelper(this.listColorGGB), 2)
        
        // tests non-nested one shared color at the same spot
        && t.checkExpect(this.listColorR.yellowHelper(this.listColorR), 1)
        
        // tests non-nested no shared color at the same spot
        && t.checkExpect(this.listColorR.yellowHelper(this.listColorG), 0);
  }
  
  // tests if the method checks if the given color is in the list
  boolean testInList(Tester t) {
    // empty case
    return t.checkExpect(this.emptyC.inList(Color.red), 0)
        
        // non-nested match non-nested
        && t.checkExpect(this.listColorR.inList(Color.red), 1)
        
        // non-nested no match non-nested
        && t.checkExpect(this.listColorR.inList(Color.green), 0)
        
        // nested match non-nested
        && t.checkExpect(this.listColorRG.inList(Color.red), 1)
        
        // nested match nested
        && t.checkExpect(this.listColorRG.inList(Color.green), 1)
        
        // nested no match
        && t.checkExpect(this.listColorRGB.inList(Color.black), 0)
        
        // nested all no match
        && t.checkExpect(this.listColorRRR.inList(Color.green), 0)
        
        // nested multiple match
        && t.checkExpect(this.listColorRRR.inList(Color.red), 1);
  }
  
  // tests if the method generates a new random sequence of colors
  boolean testCorrectSeqGenerator(Tester t) {
    
    // seeded random
    Random rand = new Random(3);
    
    //tests if the sequence creates a sequence without duplicates
    return t.checkExpect(this.listColorRGB.correctSeqGenerator(rand, false, listColorRGB.length()), 
        new ConsLoColor(Color.blue, new ConsLoColor(Color.green, new ConsLoColor(Color.red, 
            new MtLoColor()))))
        
        //tests if the sequence creates a sequence with duplicates
        && t.checkExpect(this.listColorRGB.correctSeqGenerator(rand, true, listColorRGB.length()), 
            new ConsLoColor(Color.green, new ConsLoColor(Color.red, new ConsLoColor(Color.red, 
                new MtLoColor()))));
        
  }
  
  // tests if the method removes a given color from a list of color
  boolean testRemoveColor(Tester t) {
    return t.checkExpect(this.emptyC.removeColor(Color.red), this.emptyC)
        && t.checkExpect(this.listColorR.removeColor(Color.red), this.emptyC)
        && t.checkExpect(this.listColorEverything.removeColor(Color.orange), 
            new ConsLoColor(Color.blue,
                new ConsLoColor(Color.green,
                    new ConsLoColor(Color.red,
                        new ConsLoColor(Color.pink,
                            new ConsLoColor(Color.black, 
                                new ConsLoColor(Color.gray, 
                                    new ConsLoColor(Color.MAGENTA,
                                        new ConsLoColor(Color.LIGHT_GRAY, 
                                            new MtLoColor())))))))));
  }
  
  // tests if the method submits a new world state with changes based on key presses
  // rand, dupes, seqLength, guessNum, colorChoices, currentGuess
  boolean testOnKeyEvent(Tester t) {
   
    //examples of mastermind
    //world with dupes not full answer
    Mastermind worldDupesNoFull = new Mastermind(new Random(1), true, 2, 5, this.rainbow, 
        this.listColorRG);
    
    //world with no dupes not full answer
    Mastermind worldNoDupesNoFull = new Mastermind(new Random(1), false, 2, 5, this.rainbow, 
        this.listColorRG);
    
    //world with dupes and full answer
    Mastermind worldDupesFull = new Mastermind(new Random(1), true, 2, 5, this.rainbow, 
        this.listColorBGR);
    
    //world without dupes and not full answer
    Mastermind worldNoDupesFull = new Mastermind(new Random(1), false, 2, 5, this.rainbow, 
        this.listColorRGB);
    
    //tests enter on a world with dupes and not full guess
    return t.checkExpect(worldDupesNoFull.onKeyEvent("Enter"), worldDupesNoFull)
        
        //tests on key on a world with no dupes and not full guess
        && t.checkExpect(worldNoDupesNoFull.onKeyEvent("Enter"), worldNoDupesNoFull)
        
        //tests enter on a world with dupes and a full guess
        && t.checkExpect(worldDupesFull.onKeyEvent("Enter"), 
            new Mastermind(new Random(1), true, 2, 5, this.rainbow, 
                this.listColorBGR))
        
        //tests enter on a world with no dupes but a full guess
        && t.checkExpect(worldNoDupesFull.onKeyEvent("Enter"), 
            new Mastermind(new Random(1), false, 2, 5, this.rainbow, 
                this.listColorRGB))
        
        //tests backspace on a world with dupes and not full guess
        && t.checkExpect(worldDupesNoFull.onKeyEvent("Backspace"), 
            new Mastermind(new Random(1), true, 2, 5, this.rainbow, 
                new ConsLoColor(Color.red, new ConsLoColor(Color.green, 
                    new MtLoColor()))))
        
        //tests backspace on a world with no dupes and not full guess
        && t.checkExpect(worldNoDupesNoFull.onKeyEvent("Backspace"), 
            new Mastermind(new Random(1), false, 2, 5, this.rainbow, 
                new ConsLoColor(Color.red, new ConsLoColor(Color.green, 
                    new MtLoColor()))))
        
        //tests backspace on a world with dupes and a full guess
        && t.checkExpect(worldDupesFull.onKeyEvent("Backspace"), 
            new Mastermind(new Random(1), true, 2, 5, this.rainbow, 
                new ConsLoColor(Color.blue, new ConsLoColor(Color.green, 
                    new ConsLoColor(Color.red, new MtLoColor())))))
        
        //tests backspace on a world with no dupes but a full guess
        && t.checkExpect(worldNoDupesFull.onKeyEvent("Backspace"), 
            new Mastermind(new Random(1), false, 2, 5, this.rainbow, 
                new ConsLoColor(Color.red, new ConsLoColor(Color.green, 
                    new ConsLoColor(Color.blue, new MtLoColor())))))
        
        //tests a number on a world with dupes and not full guess
        && t.checkExpect(worldDupesNoFull.onKeyEvent("5"), 
            new Mastermind(new Random(1), true, 2, 5, this.rainbow, 
                new ConsLoColor(Color.red, new ConsLoColor(Color.green, 
                    new MtLoColor()))))
        
        //tests a number on a world with no dupes and not full guess
        && t.checkExpect(worldNoDupesNoFull.onKeyEvent("5"), 
            new Mastermind(new Random(1), false, 2, 5, this.rainbow, 
                new ConsLoColor(Color.red, new ConsLoColor(Color.green, 
                    new MtLoColor()))))
        
        //tests a number on a world with dupes and a full guess
        && t.checkExpect(worldDupesFull.onKeyEvent("5"), worldDupesFull)
        
        //tests a number on a world with no dupes but a full guess
        && t.checkExpect(worldNoDupesFull.onKeyEvent("5"), worldNoDupesFull);
  }
  
  // tests if the method submits a new world state with changes based on what was submitted
  boolean testSubmitGuess(Tester t) {

    // seeded random
    Random rand = new Random(1);
    Mastermind wSeededDupe = new Mastermind(rand, true, 2, 5, listColorRGB);
    Mastermind wSeededNoDupe = new Mastermind(rand, false, 2, 5, listColorRGB);

    return t
        //tests the scene of a mastermind with dupes
        .checkExpect(wSeededDupe.makeScene(), new WorldScene(1000, 1000)
            .placeImageXY(new TextImage("Guesses Left: 5", 20, Color.black), 500, 20)
            .placeImageXY(new TextImage("Correct Sequence: ", 20, Color.black), 500, 50)
            .placeImageXY(
                new RotateImage(new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.red),
                    new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.green), 
                        new EmptyImage())), 180),
                500, 90)
            .placeImageXY(new RectangleImage(140, 80, OutlineMode.SOLID, Color.white), 500, 70)
            .placeImageXY(new TextImage("Current Guess: ", 20, Color.black), 500, 570)
            .placeImageXY(new RotateImage(new EmptyImage(), 180), 500, 610)
            .placeImageXY(new TextImage("Available Colors: ", 20, Color.black), 500, 675)
            .placeImageXY(
                new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.red),
                    new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.green),
                        new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.blue), 
                            new EmptyImage()))),
                500, 725)
            .placeImageXY(new RotateImage(new EmptyImage(), 180), 500, 530)
            .placeImageXY(new EmptyImage(), 777, 530)
            .placeImageXY(new OverlayOffsetImage(new TextImage("Exact", 20, Color.black), 100, 0,
                new TextImage("Inexact", 20, Color.black)), 787, 20))
        
        //tests the scene of a mastermind with a no dupe
        && t.checkExpect(wSeededNoDupe.makeScene(), new WorldScene(1000, 1000)
            .placeImageXY(new TextImage("Guesses Left: 5", 20, Color.black), 500, 20)
            .placeImageXY(new TextImage("Correct Sequence: ", 20, Color.black), 500, 50)
            .placeImageXY(
                new RotateImage(new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.red),
                    new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.green), 
                        new EmptyImage())), 180),
                500, 90)
            .placeImageXY(new RectangleImage(140, 80, OutlineMode.SOLID, Color.white), 500, 70)
            .placeImageXY(new TextImage("Current Guess: ", 20, Color.black), 500, 570)
            .placeImageXY(new RotateImage(new EmptyImage(), 180), 500, 610)
            .placeImageXY(new TextImage("Available Colors: ", 20, Color.black), 500, 675)
            .placeImageXY(
                new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.red),
                    new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.green),
                        new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.blue), 
                            new EmptyImage()))),
                500, 725)
            .placeImageXY(new RotateImage(new EmptyImage(), 180), 500, 530)
            .placeImageXY(new EmptyImage(), 777, 530)
            .placeImageXY(new OverlayOffsetImage(new TextImage("Exact", 20, Color.black), 100, 0,
                new TextImage("Inexact", 20, Color.black)), 787, 20));
  }
  
  // tests if the method creates a new scene that reflects the game settings
  boolean testMakeScene(Tester t) {
    
    // seeded random
    Random rand = new Random(1);
    Mastermind wSeededDupe = new Mastermind(rand, false, 2, 5, listColorRGB);
    Mastermind wSeededNoDupe = new Mastermind(rand, false, 2, 5, listColorRGB);

    //tests the scene of a mastermind with dupes
    return t.checkExpect(wSeededDupe.makeScene(), new WorldScene(1000, 1000)
            .placeImageXY(new TextImage("Guesses Left: 5", 20, Color.black), 500, 20)
            .placeImageXY(new TextImage("Correct Sequence: ", 20, Color.black), 500, 50)
            .placeImageXY(
                new RotateImage(new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.red),
                    new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.green), 
                        new EmptyImage())), 180),
                500, 90)
            .placeImageXY(new RectangleImage(140, 80, OutlineMode.SOLID, Color.white), 500, 70)
            .placeImageXY(new TextImage("Current Guess: ", 20, Color.black), 500, 570)
            .placeImageXY(new RotateImage(new EmptyImage(), 180), 500, 610)
            .placeImageXY(new TextImage("Available Colors: ", 20, Color.black), 500, 675)
            .placeImageXY(
                new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.red),
                    new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.green),
                        new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.blue), 
                            new EmptyImage()))),
                500, 725)
            .placeImageXY(new RotateImage(new EmptyImage(), 180), 500, 530)
            .placeImageXY(new EmptyImage(), 777, 530)
            .placeImageXY(new OverlayOffsetImage(new TextImage("Exact", 20, Color.black), 100, 0,
                new TextImage("Inexact", 20, Color.black)), 787, 20))
        
        //tests the scene of a mastermind with no dupe
        && t.checkExpect(wSeededNoDupe.makeScene(), new WorldScene(1000, 1000)
            .placeImageXY(new TextImage("Guesses Left: 5", 20, Color.black), 500, 20)
            .placeImageXY(new TextImage("Correct Sequence: ", 20, Color.black), 500, 50)
            .placeImageXY(
                new RotateImage(new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.red),
                    new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.green), 
                        new EmptyImage())), 180),
                500, 90)
            .placeImageXY(new RectangleImage(140, 80, OutlineMode.SOLID, Color.white), 500, 70)
            .placeImageXY(new TextImage("Current Guess: ", 20, Color.black), 500, 570)
            .placeImageXY(new RotateImage(new EmptyImage(), 180), 500, 610)
            .placeImageXY(new TextImage("Available Colors: ", 20, Color.black), 500, 675)
            .placeImageXY(
                new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.red),
                    new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.green),
                        new BesideImage(new CircleImage(20, OutlineMode.SOLID, Color.blue), 
                            new EmptyImage()))),
                500, 725)
            .placeImageXY(new RotateImage(new EmptyImage(), 180), 500, 530)
            .placeImageXY(new EmptyImage(), 777, 530)
            .placeImageXY(new OverlayOffsetImage(new TextImage("Exact", 20, Color.black), 100, 0,
                new TextImage("Inexact", 20, Color.black)), 787, 20));
  }
  
}
