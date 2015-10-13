

/** @author Alexc007
*
*/

import javax.swing.JOptionPane;







public class Program 
{

	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		String firstNumber = "";
		String secondNumber = "";
		
		
		
			
		try 
		{
			firstNumber = JOptionPane.showInputDialog("Enter First Integer"); //pop out menu that ask to enter integer
			System.out.println(firstNumber);
			secondNumber = JOptionPane.showInputDialog("Enter Second Integer");
			System.out.println(secondNumber);
			
			int number1 = Integer.parseInt(firstNumber);
			int number2 = Integer.parseInt(secondNumber);
			
			int sum = number1 + number2;
			
			JOptionPane.showMessageDialog(null, "The sum is " + sum + " Sum of two integers");
			
		} catch (Exception e)
		{
			//JOptionPane.showMessageDialog(null, "Incorrect Values Entered");
		JOptionPane.showMessageDialog(null, "Incorrect Values Entered"	, "Error Entry", JOptionPane.ERROR_MESSAGE);
			System.out.println(e);
		}
		
		
	

				
		
// STOPPED AT END OF LESSON 4
	}

}
