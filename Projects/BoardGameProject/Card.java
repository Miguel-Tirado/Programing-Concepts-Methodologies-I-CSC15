public class Card 
{
   //Instance Variables
   private int value;
   private boolean faceUp;
   public Card(int initValue)
   {
      value = initValue;
      faceUp = false;
   }
   public int getValue()
   {
      return value;
   }
   public boolean isFaceUp()
   {
      return faceUp;
   }
   public void flipCard()
   {
      if (faceUp == false)
      {
         faceUp = true;
      }
      else if(faceUp == true)
      {
         faceUp = false;
      }
   }
   public void setFaceUp()
   {
      faceUp = true;    
   }
   public void setFaceDown()
   {
      faceUp = false;
   }
   public boolean equals(Card otherCard)
   {
      return (this.value == otherCard.value);
   }
   public String toString()
   {
      String s = "";
      if (faceUp)
      {
         return s + value;
      } 
      else
      {
         return "*";
      }
   }
       

}