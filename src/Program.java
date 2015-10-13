

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
		
		
		
			
		try //the code is inside a Try - Catch block so that if you press CANCEL or insert INCORRECT VALUE
		// the java execution would not be interrupted by the exception - but handle it properly
		{
			firstNumber = JOptionPane.showInputDialog("Enter First Integer"); //pop out menu that ask to enter integer
			System.out.println(firstNumber);
			secondNumber = JOptionPane.showInputDialog("Enter Second Integer");
			System.out.println(secondNumber);
			
			int number1 = Integer.parseInt(firstNumber); //convert an integer that has been inserted into a string
			int number2 = Integer.parseInt(secondNumber); //convert an integer that has been inserted into a string
			
			int sum = number1 + number2;
			
			JOptionPane.showMessageDialog(null, "The sum is " + sum + " Sum of two integers"); //open another message box that will show the sum of the numbers
			
		} catch (Exception e) //catch exception
		{
			//JOptionPane.showMessageDialog(null, "Incorrect Values Entered");
		JOptionPane.showMessageDialog(null, "Incorrect Values Entered"	, "Error Entry", JOptionPane.ERROR_MESSAGE); //display an error message box after getting an exception
			System.out.println(e); //print out the exception itself
		}
		
		
	

				
		
// STOPPED AT END OF LESSON 4
	}

}
