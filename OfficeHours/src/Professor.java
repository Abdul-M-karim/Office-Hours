
public class Professor {
	static int question;  // if question is asked its 1 if a question has been answered it becomes 0.
	//final Professor professor = new Professor();
		public synchronized void AnswerQuestion(String S) throws InterruptedException 
		{
			while ( true){ // infinite while loop
					if ( question != 0){
						System.out.println(S); // print answer
						decrementQuestion();
								//wait();
						Thread.sleep(1000);
					}
					else if ( question == 0){ // if question is not zero there is a question
						notify();
						Thread.sleep(1000);}
						   // bring question back to zero
		}
		}
	
	public void decrementQuestion()
	{
		question = 0;
		
	}
	public void incrementQuestion()
	{
		question++;
		
	}
		
		
		
	
}


