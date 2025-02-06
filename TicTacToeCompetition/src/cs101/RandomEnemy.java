package cs101;

public class RandomEnemy implements Player {

	private Mark mark = Mark.O;

	@Override
	public void make_next_move(Board board) {

		// enemy always chooses a random unmarked square
		board.play_random_square(mark);

	}

}
