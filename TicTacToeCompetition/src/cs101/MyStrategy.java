package cs101;

/**
 * Author: Jess Woods
 *
 * Honor Pledge: I certify that no unauthorized assistance has been received or
 * given in the completion of this work. I certify that I understand and could
 * now rewrite on my own, without assistance from collaborators or course staff,
 * the problem set code I am submitting.
 * 
 * Describe your Tic Tac Toe Strategy in plain English here (in a comment):
 * 
 * 
 * 
 * 
 * 
 */

public class MyStrategy implements Player {

	Mark mark = Mark.X;

	@Override
	public void make_next_move(Board board) {

		// add code here to make one move at a time
		board.play_random_square(mark);

	}

}
