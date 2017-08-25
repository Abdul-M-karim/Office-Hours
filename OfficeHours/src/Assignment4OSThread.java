
public class Assignment4OSThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final Professor professor = new Professor();
		final Student student = new Student();
		Thread SThread1 = new Thread( new Runnable(){ //  implement a version of run for runnable
			public void run(){ // had to use try catch would give error otherwise
				try {
					
					student.AskQuestion("Ask Question");// Ask question
					professor.incrementQuestion();		 // increment question
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				       
			}
			});
		Thread PThread2 = new Thread( new Runnable(){ // implement a version of run for Runnable
			public void run(){
			try {
				professor.AnswerQuestion("Question Answered");// Answer Question
				student.decrementQuestion();				// Decrement Question
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
								 
			}
	});
		SThread1.start(); // required to actually create a new thread so that runnable run method is executed at the same time
		PThread2.start();// required to actually create a new thread so that runnable run method is executed at the same time
		
		// this means that thread1 will finish before thread2
		SThread1.join();
		PThread2.join();
	}

}
