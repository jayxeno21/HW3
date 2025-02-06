package cs101;

public class TicTacToe {

	public static void main(String[] args) {
		// Game runner
		Board board = new Board();

		// possible players
		MyStrategy me = new MyStrategy();
		OrderedEnemy order_enemy = new OrderedEnemy();
		RandomEnemy random_enemy = new RandomEnemy();
		DiagonalEnemy diagonal_enemy = new DiagonalEnemy();

		// show empty board
		board.print();

		// while game is not over
		while (true) {

			// Your move
			System.out.println("Player 1's turn: ");

			me.make_next_move(board);

			board.print();

			// check if player 1 just won
			if (board.game_is_over() != Mark.BLANK || board.is_board_full()) {
				break;
			}

			// Enemy bot's move
			System.out.println("Player 2's turn: ");

			// ONLY UNCOMMENT ONE ENEMY AT A TIME
			// order_enemy.make_next_move(board);
			random_enemy.make_next_move(board);
			// diagonal_enemy.make_next_move(board);

			board.print();

			// check if player 2 just won
			if (board.game_is_over() != Mark.BLANK || board.is_board_full()) {
				break;
			}
		}

		if (board.game_is_over() != Mark.BLANK) {
			System.out.println(board.game_is_over() + " won!");

		} else {
			System.out.println("Draw!");
		}

	}

}
