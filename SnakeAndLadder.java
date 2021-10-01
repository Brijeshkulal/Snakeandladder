public class SnakeAndLadder
{
	public static void main(String[] args)
	{
		System.out.println( "Welcome To Snake And Ladder Simulator" );
		int startPosition = 0;
		int endPosition = 100;
		System.out.println("stating position of player is " + startPosition);
		int diceValue = (int) Math.floor((Math.random() * 10) %6) + 1;
		System.out.println("dice value is " + diceValue);
	}
}
