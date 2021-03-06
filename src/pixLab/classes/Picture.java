package pixLab.classes;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void zeroRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	      }
	    }
	}
  
  public void zeroGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
      }
    }
  }
  
  public void allRed()
  {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setGreen(0);
	        pixelObj.setBlue(0);
	        
	      }
	    }
  }
  
  public void allGreen()
  {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	        pixelObj.setBlue(0);
	        
	      }
	    }
  }
  
  public void allBlue()
  {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	        pixelObj.setGreen(0);
	        
	      }
	    }
  }
  
  public void halfAllButBlue()
  {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	int red = pixelObj.getRed();
	    	int green = pixelObj.getGreen();
	        pixelObj.setRed(red/2);
	        pixelObj.setGreen(green/2);
	        
	      }
	    }
  }
  
  
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorozontal()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int height = pixels.length;
	  
	  for(int cols = 0; cols < pixels[0].length; cols++)
	  {
		  for(int rows = 0; rows < height / 2; rows++)
		  {
			  topPixel = pixels[rows][cols];
			  bottomPixel = pixels[height - 1 - rows][cols];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
  }
 
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 400;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int count = 0;
	  Pixel[][] pixels = this.getPixels2D();
	  int height = pixels.length;
	  
	  
	  for (int row = 230; row < 327; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 231; col < mirrorPoint; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row][(mirrorPoint - col + mirrorPoint)];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }
	  for(int cols = 0; cols < pixels[0].length; cols++)
	  {
		  for(int rows = 0; rows < height / 2; rows++)
		  {
			  topPixel = pixels[rows][cols];
			  bottomPixel = pixels[height - 1 - rows][cols];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
  }

 
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("barbaraS.jpg");
    Picture flower2 = new Picture("robot.jpg");
    Picture hand = new Picture("hand.jpg");
    this.copy(flower1,0,0);
    this.copy(flower1,150,0);
    this.copy(flower2,100,0);
    Picture flowerNoBlue = new Picture(flower2);
    Picture flowerNoBlue2 = new Picture(flower1);
    flowerNoBlue.halfAllButBlue();
    flowerNoBlue2.halfAllButBlue();
    this.copy(flowerNoBlue,0,120);
    this.copy(flowerNoBlue,0,161);
    this.copy(flowerNoBlue,0,202);
    this.copy(flowerNoBlue,0,243);
    this.copy(flowerNoBlue,0,284);
    this.copy(flowerNoBlue2,72,111);
    this.copy(flowerNoBlue2,72,222);
    this.copy(hand,0,0);
    
    this.mirrorVertical();
    this.mirrorHorozontal();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  public void mirrorRandom()
  {
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
//	  Pixel topPixel = null;
//	  Pixel bottomPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  int height = pixels.length;
	  int width = pixels[0].length; 
	  int widthMirrorPoint = (int) ((width - 1) * Math.random());
	  int heightMirrorPoint = (int) ((height - 1) * Math.random());
	  
	  for (int row = heightMirrorPoint; row < pixels.length; row++)
	  {
		  for (int col = widthMirrorPoint; col < pixels[0].length; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][(widthMirrorPoint - col + widthMirrorPoint)]; 
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }

  }
  
  public void randomPixelsColor()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel pixel = null;
	  int height = pixels.length;
	  int width = pixels[0].length; 
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		for(int row = 0; row < height; row++)
		{
			for(int col = 0; col < width; col++)
			{
				int randomNum = (int) (Math.random() * 1000000000);
				if(randomNum % 3 == 0)
				{
				pixel = pixels[row][col];
				pixel.setBlue(blue);
				pixel.setGreen(green);
				pixel.setRed(red);
				}
			}
		}
  }
  
  //Picture Glitch
  
  public void glitchy()
  {
	  int num = (int) (7 * Math.random());
	  int loop = (int) (20 * Math.random());
	  
	  if(num == 0)
	  {
		  this.allBlue();
	  }
	  if(num == 1)
	  {
		  this.allGreen();
	  }
	  if(num == 2)
	  {
		  this.allRed();
	  }
	  if(num == 3)
	  {
		  this.zeroBlue();
	  }
	  if(num == 4)
	  {
		  this.zeroGreen();
	  }
	  if(num == 5)
	  {
		  this.zeroRed();
	  }
	  if(num == 6)
	  {
		  this.halfAllButBlue();
	  }
	  
	  //this.mirrorRandom();
	  for (int a = 0; a < loop; a++)
	  {
	  this.randomPixelsColor();
	  }

	  	  
}
  
  public void randomPixelColors()
  {
	  int loop = (int) (7 * Math.random());
	  for (int a = 0; a < loop; a++)
	  {
	  this.randomPixelsColor();
	  }
  }
  
  public void chromakey(Picture replacement, Color changeColor)
  {
	  Pixel[][] mainPixels = this.getPixels2D();
	  Pixel[][] replacementPixels = replacement.getPixels2D();
	  
	  for(int row = 0; row < mainPixels.length; row++)
	  {
		  for (int col = 0; col < mainPixels[0].length; col++)
		  {
			  if(mainPixels[row][col].colorDistance(changeColor) < 20)
			  {
				  mainPixels[row][col].setColor(replacementPixels[row][col].getColor());
			  }
		  }
	  }
  }
  
  public void shiftLeftRight(int amount)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Picture temp = new Picture(this);
	  Pixel [][] copied = temp.getPixels2D();
	  
	  
	  int shiftValue = amount;
	  int width = pixels[0].length;
	  
	  for(int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  shiftValue = (col + amount) % width;
			  copied[row][col].setColor(pixels[row][shiftValue].getColor());
		  }
	  }
	  
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  pixels[row][col].setColor(copied[row][col].getColor());
		  }
	  }
			  
  }
  
  public void hidePicture(Picture hidden)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel[][] hiddenPixels = hidden.getPixels2D();
	  
	  for(int row = 0; row < pixels.length && row < hiddenPixels.length; row++)
	  {
		  for(int col = 0; col < pixels[0].length && col < hiddenPixels[0].length; col++)
		  {
			  if(hiddenPixels[row][col].colorDistance(Color.WHITE) > 5)
			  {
				  if(hiddenPixels[row][col].getRed() > 0 && pixels[row][col].getRed() % 2 != 1)
				  {
					  pixels[row][col].setRed(pixels[row][col].getRed() - 1);
				  }
			  }
			  else if (pixels[row][col].getRed() > 0 && pixels[row][col].getRed() % 2 != 1)
			  {
				  pixels[row][col].setRed(pixels[row][col].getRed() - 1);
			  }
		  }
	  }
  }
  
  public void revealPicture()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for(int row = 0; row < pixels.length; row++)
	  {
		  for(int col = 0; col < pixels[0].length; col++)
		  {
			  if(pixels[row][col].getRed() % 2 != 1)
			  {
				  pixels[row][col].setColor(Color.MAGENTA);
			  }
			  else if (pixels[row][col].getRed() %2 != 1)
			  {
				  pixels[row][col].setColor(Color.CYAN);
			  }
		  }
	  }
  }
  
  public void shift()
  {
	  int amount = (int) (Math.random() * 300);
	  this.shiftLeftRight(amount);

	 
	  int mirr = (int) (Math.random() *5);
	  
	  if(mirr == 0)
	  {
		  
	  }
	  else if(mirr == 1)
	  {
		  this.mirrorVertical();
	  }
	  else if(mirr == 2)
	  {
		  this.mirrorHorozontal();
	  }
	  else if(mirr == 3)
	  {
		  this.mirrorVertical();
		  this.mirrorHorozontal();
	  }
	  else if(mirr == 4)
	  {
		  this.mirrorHorozontal();
		  this.mirrorVertical();
	  }
	  

	  
//	  int num = (int) (7 * Math.random());
//
//	  
//	  if(num == 0)
//	  {
//		  this.allBlue();
//	  }
//	  if(num == 1)
//	  {
//		  this.allGreen();
//	  }
//	  if(num == 2)
//	  {
//		  this.allRed();
//	  }
//	  if(num == 3)
//	  {
//		  this.zeroBlue();
//	  }
//	  if(num == 4)
//	  {
//		  this.zeroGreen();
//	  }
//	  if(num == 5)
//	  {
//		  this.zeroRed();
//	  }
//	  if(num == 6)
//	  {
//		  this.halfAllButBlue();
//	  }
	  
//	  int num = (int) (7 * Math.random());
//
//	  
//	  if(num == 0)
//	  {
//		  this.allBlue();
//	  }
//	  if(num == 1)
//	  {
//		  this.allGreen();
//	  }
//	  if(num == 2)
//	  {
//		  this.allRed();
//	  }
//	  if(num == 3)
//	  {
//		  this.zeroBlue();
//	  }
//	  if(num == 4)
//	  {
//		  this.zeroGreen();
//	  }
//	  if(num == 5)
//	  {
//		  this.zeroRed();
//	  }
//	  if(num == 6)
//	  {
//		  this.halfAllButBlue();
//	  }
  }
  
  
  
  
  
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
