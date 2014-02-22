package dspa

object Graph1 {
    val edges = List(("foo", "bar", 5.0),
                     ("foo", "baz", 2.0),
                     ("bar", "baz", 1.0))
}

object Graph2 {
    val edges = List(("1", "2", 7.0),
                     ("1", "3", 9.0),
                     ("1", "6", 14.0),
                     ("2", "3", 10.0),
                     ("2", "4", 15.0),
                     ("3", "4", 11.0),
                     ("3", "6", 2.0),
                     ("4", "5", 6.0),
                     ("5", "6", 9.0))
}

object Graph3 {
    val edges = List((1, 2, 7.0),
                     (1, 3, 5.0),
                     (1, 4, 8.0),
                     (1, 5, 10.0),
                     (2, 3, 8.0),
                     (2, 7, 9.0),
                     (3, 4, 2.0),
                     (3, 5, 3.0),
                     (3, 6, 9.0),
                     (3, 7, 7.0),
                     (4, 5, 3.0),
                     (5, 6, 5.0),
                     (5, 8, 5.0),
                     (6, 7, 3.0),
                     (6, 8, 6.0),
                     (6, 9, 4.0),
                     (6, 10, 5.0),
                     (7, 9, 3.0),
                     (8, 10, 4.0),
                     (9, 10, 6.0))
}

object Graph4 {
    val edges = List((1, 2, 5.0),
                     (3, 4, 3.0))
}
