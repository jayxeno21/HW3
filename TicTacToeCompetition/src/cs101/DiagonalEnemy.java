package cs101;

public class DiagonalEnemy implements Player {

	private Mark mark = Mark.O;

	@Override
	public void make_next_move(Board board) {

		boolean played = false;

		// attempt to play in the top left slot
		played = board.play_top_left(mark);

		// if that slot was already taken, play in the middle center slot
		if (!played) {
			played = board.play_middle_center(mark);
		}

		// if that slot was already taken, play in the bottom right slot
		if (!played) {
			played = board.play_bottom_right(mark);
		}

		// if all of those slots are taken, choose a random square
		if (!played) {
			board.play_random_square(mark);
		}
	}

}
