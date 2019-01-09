package pixLab.classes;
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
    Picture swan = new Picture("hand.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testGlitchy()
  {
	  Picture glitch = new Picture("kitten2.jpg");
	  glitch.glitchy();
	  glitch.explore();
	  
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
    testGlitchy();
  }
}