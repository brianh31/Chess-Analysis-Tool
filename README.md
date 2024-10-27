# Chess Analysis Tool

## Overview
The **Chess Analysis Tool** is a Java-based application that allows users to analyze and simulate basic chess positions. It features a chessboard with standard pieces and includes basic move validation for pawns and rooks. This project is ideal for those interested in learning the fundamentals of chess logic and expanding their knowledge of Java programming.

## Features
- **Chessboard Setup**: Initializes a standard 8x8 chessboard with pieces in their starting positions.
- **Basic Move Validation**: Validates simple moves for pawns and rooks.
- **Player Input**: Users can input moves via console to test different chess positions.

## Project Structure
ChessAnalysisTool/ │ README.md │  └───src/ └───main/ └───java/ └───com/ └───chessanalysis/ │ ChessAnalyzer.java │ Board.java │ Piece.java │ MoveValidator.java │ Position.java │ PieceType.java


## Getting Started
### Prerequisites
- Java JDK 8 or higher installed on your machine.

### Steps to Run
1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/ChessAnalysisTool.git

Navigate to the project directory:
cd ChessAnalysisTool/src/main/java

Compile the project:
javac com/chessanalysis/*.java

Run the application:
java com.chessanalysis.ChessAnalyzer
