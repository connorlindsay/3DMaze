all:	Maze.java
		javac Maze.java

run:	all
		java Maze

clean:	all
		rm *.class