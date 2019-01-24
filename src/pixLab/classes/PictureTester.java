package pixLab.classes;

import java.awt.Color;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testZeroRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroRed();
    beach.explore();
  }
  
  public static void testZeroGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroGreen();
    beach.explore();
  }
  
  public static void testAllRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.allRed();
    beach.explore();
  }
  
  public static void testAllGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.allGreen();
    beach.explore();
  }
  public static void testAllBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.allBlue();
    beach.explore();
  }
  
  public static void testHalfAllButBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.halfAllButBlue();
    beach.explore();
  }
  
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture moon = new Picture("hand.jpg");
    moon.explore();
    moon.mirrorVertical();
    moon.explore();
  }
  
  public static void testMirrorHorozontal()
  {
    Picture moon = new Picture("hand.jpg");
    moon.explore();
    moon.mirrorHorozontal();
    moon.explore();
  }
  
  
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("sans.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testGlitchy()
  {
	  Picture glitch = new Picture("kitten2.jpg");
	  glitch.glitchy();
	  glitch.explore();
	  
  }
  
  public static void testChromakey()
  {
	  Picture source = new Picture("earthClose.jpg");
	  Picture background = new Picture("galaxy4.jpg");
	  
	  source.explore();
	  background.explore();
	  source.chromakey(background, Color.black);
	  source.explore();
  }
  
  public static void testShiftLeftRight()
  {
	  Picture shift = new Picture("kitten2.jpg");
	  
	  int amount = (int) (Math.random() * (shift.getWidth()));
	  shift.shiftLeftRight(amount);
	  shift.explore();
	  
  }
  
  public static void testMegaGlitch()
  {
	  Picture source = new Picture("sans.jpg");
	  Picture background = new Picture("sans.jpg");
	  
	  source.explore();
	  int amount = (int) (Math.random() * 300);
	  source.shiftLeftRight(amount);
	  source.explore();
	 
	  int mirr = (int) (Math.random() *5);
	  
	  if(mirr == 0)
	  {
		  
	  }
	  else if(mirr == 1)
	  {
		  source.mirrorVertical();
	  }
	  else if(mirr == 2)
	  {
		  source.mirrorHorozontal();
	  }
	  else if(mirr == 3)
	  {
		  source.mirrorVertical();
		  source.mirrorHorozontal();
	  }
	  else if(mirr == 4)
	  {
		  source.mirrorHorozontal();
		  source.mirrorVertical();
	  }
	  
	  source.explore();
	  

	  source.chromakey(background, Color.black);
	  source.explore();
	  
	  
	  int num = (int) (7 * Math.random());

	  
	  if(num == 0)
	  {
		  source.allBlue();
	  }
	  if(num == 1)
	  {
		  source.allGreen();
	  }
	  if(num == 2)
	  {
		  source.allRed();
	  }
	  if(num == 3)
	  {
		  source.zeroBlue();
	  }
	  if(num == 4)
	  {
		  source.zeroGreen();
	  }
	  if(num == 5)
	  {
		  source.zeroRed();
	  }
	  if(num == 6)
	  {
		  source.halfAllButBlue();
	  }
	  
	  source.explore();
	  
	  source.randomPixelColors();
	  
	  source.explore();
	  
	  
	  
	  
  }
  
  public static void testSteganography()
  {
	  Picture source = new Picture(".jpg");
	  
	  Picture message = new Picture("trollface.jpg");
	  source.explore();
	  message.explore();
	  source.hidePicture(message);
	  source.explore();
	  source.revealPicture();
	  source.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
 //   testZeroBlue();
 //   testZeroRed();
 //   testZeroGreen();
 //   testAllRed();
 //   testAllGreen();
 //   testAllBlue();
 //   testHalfAllButBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
 //   testMirrorVertical();
 //   testMirrorHorozontal();
 //   testMirrorTemple();
    //testMirrorArms();
 //   testMirrorGull();
    //testMirrorDiagonal();
 //   testCollage();
    //testCopy();
 //   testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
 //   testGlitchy();
//	  testChromakey();
//	  testShiftLeftRight();
//	  testMegaGlitch();
	  testSteganography();
  }
}