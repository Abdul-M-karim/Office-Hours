
public class Student {
	final Professor professor = new Professor();
	public  synchronized void AskQuestion(String S) throws InterruptedException 
	{
		while( true)
		{
			if ( Professor.question == 0)
			{
					System.out.println(S);
					professor.incrementQuestion();
					//wait();
					Thread.sleep(1000);
			}
		 if ( Professor.question != 0 )
		notify();
		Thread.sleep(1000);
		}
		
		}
	
	public void incrementQuestion()
	{
		professor.incrementQuestion();
	}
	public void decrementQuestion()
	{
		professor.decrementQuestion();
	}

}
