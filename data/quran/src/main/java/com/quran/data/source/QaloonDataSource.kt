package com.quran.data.source

internal class QaloonDataSource : MadaniDataSource() {

  override fun getAyahForPageArray() = intArrayOf(
      1, 1, 6, 17, 25, 30, 38, 49, 58, 62, 70, 77, 84, 89,
      94, 102, 106, 113, 120, 127, 135, 142, 146, 154, 164, 170, 177, 182,
      187, 191, 197, 203, 211, 216, 220, 225, 231, 234, 238, 246, 249, 253,
      257, 260, 265, 270, 275, 282, 283, 1, 10, 16, 23, 30, 38, 46,
      53, 62, 71, 78, 84, 92, 101, 109, 116, 122, 133, 141, 149, 154,
      158, 166, 174, 181, 187, 195, 1, 7, 12, 15, 20, 24, 27, 34,
      38, 45, 52, 60, 66, 75, 80, 87, 92, 95, 102, 106, 114, 122,
      128, 135, 141, 148, 155, 163, 171, 176, 3, 6, 10, 14, 18, 24,
      32, 37, 42, 46, 51, 58, 65, 71, 77, 83, 90, 96, 104, 109,
      114, 1, 9, 19, 28, 36, 45, 53, 60, 69, 74, 82, 91, 95,
      102, 111, 119, 125, 132, 138, 143, 147, 152, 158, 1, 12, 23, 31,
      38, 44, 52, 58, 68, 74, 82, 88, 96, 105, 121, 131, 138, 144,
      150, 156, 160, 164, 171, 179, 188, 196, 1, 9, 17, 26, 34, 41,
      46, 53, 62, 70, 1, 7, 14, 21, 27, 32, 37, 41, 48, 55,
      62, 69, 73, 80, 87, 94, 100, 107, 112, 118, 123, 1, 7, 15,
      21, 26, 34, 43, 54, 62, 71, 79, 89, 98, 107, 6, 13, 20,
      29, 38, 46, 54, 63, 72, 82, 89, 98, 109, 118, 5, 15, 23,
      31, 38, 44, 53, 64, 70, 79, 87, 96, 104, 1, 6, 14, 19,
      29, 35, 43, 6, 11, 19, 25, 34, 43, 1, 16, 32, 52, 71,
      91, 7, 15, 27, 35, 43, 55, 65, 73, 80, 88, 94, 103, 111,
      119, 1, 8, 18, 28, 39, 50, 59, 67, 76, 87, 97, 105, 5,
      16, 21, 28, 35, 46, 54, 62, 75, 84, 98, 1, 12, 26, 39,
      52, 65, 77, 96, 13, 38, 52, 65, 77, 88, 99, 114, 126, 1,
      11, 25, 36, 45, 58, 73, 82, 91, 102, 1, 6, 16, 24, 31,
      39, 47, 56, 65, 73, 1, 18, 28, 43, 60, 75, 90, 105, 1,
      11, 21, 28, 32, 37, 44, 54, 59, 62, 3, 12, 21, 33, 44,
      56, 68, 1, 20, 40, 61, 84, 112, 137, 160, 184, 207, 1, 14,
      23, 36, 45, 56, 64, 77, 89, 6, 14, 22, 29, 36, 44, 51,
      60, 71, 78, 85, 7, 15, 24, 31, 39, 46, 53, 64, 6, 16,
      25, 33, 42, 51, 1, 12, 20, 29, 1, 12, 21, 1, 7, 16,
      23, 31, 36, 44, 51, 55, 63, 1, 8, 15, 23, 32, 40, 49,
      4, 12, 19, 31, 39, 45, 13, 28, 41, 55, 71, 1, 25, 52,
      77, 103, 127, 154, 1, 17, 27, 43, 62, 84, 6, 11, 22, 32,
      41, 48, 57, 68, 75, 8, 17, 26, 34, 41, 50, 59, 67, 78,
      1, 12, 21, 30, 39, 47, 1, 11, 16, 23, 32, 45, 52, 11,
      23, 34, 48, 61, 74, 1, 19, 40, 1, 14, 23, 33, 6, 15,
      21, 29, 1, 12, 20, 30, 1, 10, 16, 24, 29, 5, 12, 1,
      16, 36, 7, 31, 52, 15, 32, 1, 27, 45, 7, 28, 50, 17,
      41, 68, 17, 51, 77, 4, 12, 19, 25, 1, 7, 12, 22, 4,
      10, 17, 1, 6, 12, 6, 1, 9, 5, 1, 10, 1, 6, 1,
      8, 1, 13, 27, 16, 43, 9, 35, 11, 40, 11, 1, 14, 1,
      20, 18, 48, 20, 6, 26, 20, 1, 31, 16, 1, 1, 1, 7,
      35, 1, 1, 15, 1, 24, 1, 15, 1, 1, 8, 10, 1, 1,
      1, 1)

  override fun getQuarterStartByPage() = intArrayOf(
      -1, -1, -1, -1, 1, -1, 2, -1, 3, -1, 4, -1, -1, 5, -1, -1, 6,
      -1, 7, -1, -1, 8, -1, 9, -1, -1, 10, -1, 11, -1, -1, 12, -1, 13,
      -1, -1, 14, -1, 15, -1, -1, 16, -1, 17, -1, 18, -1, -1, 19, -1, 20,
      -1, -1, 21, -1, 22, -1, -1, 23, -1, -1, 24, -1, 25, -1, -1, 26, -1,
      27, -1, -1, 28, -1, 29, -1, -1, 30, -1, 31, -1, -1, 32, -1, 33, -1,
      -1, 34, -1, 35, -1, -1, 36, -1, 37, -1, -1, 38, -1, -1, 39, -1, 40,
      -1, 41, -1, 42, -1, -1, 43, -1, -1, 44, -1, 45, -1, 46, -1, -1, 47,
      -1, 48, -1, -1, 49, -1, 50, -1, -1, 51, -1, -1, 52, -1, 53, -1, -1,
      54, -1, -1, 55, -1, 56, -1, 57, -1, 58, -1, 59, -1, -1, 60, -1, -1,
      61, -1, 62, -1, 63, -1, -1, -1, 64, -1, 65, -1, -1, 66, -1, -1, 67,
      -1, -1, 68, -1, 69, -1, 70, -1, 71, -1, -1, 72, -1, 73, -1, -1, 74,
      -1, 75, -1, -1, 76, -1, 77, -1, 78, -1, -1, 79, -1, 80, -1, -1, 81,
      -1, 82, -1, -1, 83, -1, -1, 84, -1, 85, -1, -1, 86, -1, 87, -1, 88,
      -1, -1, 89, -1, 90, -1, 91, -1, -1, 92, -1, 93, -1, -1, 94, -1, 95,
      -1, -1, -1, 96, -1, 97, -1, -1, 98, -1, 99, -1, -1, 100, -1, 101,
      -1, 102, -1, -1, 103, -1, -1, 104, -1, 105, -1, -1, 106, -1, -1,
      107, -1, 108, -1, -1, 109, -1, 110, -1, -1, 111, -1, 112, -1, 113,
      -1, -1, 114, -1, 115, -1, -1, 116, -1, -1, 117, -1, 118, -1, 119,
      -1, -1, 120, -1, 121, -1, 122, -1, -1, 123, -1, -1, 124, -1, -1, 125,
      -1, 126, -1, 127, -1, -1, 128, -1, 129, -1, 130, -1, -1, 131, -1,
      -1, 132, -1, 133, -1, 134, -1, -1, 135, -1, -1, 136, -1, 137, -1,
      -1, 138, -1, -1, 139, -1, 140, -1, 141, -1, 142, -1, -1, 143, -1,
      -1, 144, -1, 145, -1, -1, 146, -1, 147, -1, 148, -1, -1, 149, -1,
      -1, 150, -1, 151, -1, -1, 152, -1, 153, -1, 154, -1, -1, 155, -1, -1,
      156, -1, 157, -1, 158, -1, -1, 159, -1, -1, 160, -1, 161, -1, -1, 162,
      -1, -1, 163, -1, -1, 164, -1, 165, -1, -1, 166, -1, 167, -1, 168, -1,
      169, -1, 170, -1, -1, 171, -1, 172, -1, 173, -1, -1, 174, -1, -1, 175,
      -1, -1, 176, -1, 177, -1, 178, -1, -1, 179, -1, 180, -1, -1, 181, -1,
      182, -1, -1, 183, -1, -1, 184, -1, 185, -1, -1, 186, -1, 187, -1, -1, 188,
      -1, 189, -1, -1, 190, -1, 191, -1, -1, 192, -1, 193, -1, 194, -1, 195, -1,
      -1, 196, -1, 197, -1, -1, -1, 198, -1, 199, -1, -1, 200, -1, -1, 201, -1,
      202, -1, -1, 203, -1, -1, 204, -1, 205, -1, 206, -1, 207, -1, -1, 208,
      -1, 209, -1, 210, -1, -1, 211, -1, 212, -1, -1, 213, -1, 214, -1, -1,
      215, -1, -1, 216, -1, 217, -1, -1, 218, -1, -1, 219, -1, -1, 220, -1,
      221, -1, -1, 222, -1, 223, -1, 224, -1, 225, -1, 226, -1, -1, -1, 227,
      -1, 228, -1, -1, 229, -1, 230, -1, 231, -1, -1, 232, -1, -1, 233, -1,
      234, -1, 235, -1, 236, -1, -1, 237, -1, 238, -1, -1, -1, 239, -1, -1,
      -1, -1)

  override fun getQuartersArray() = arrayOf(
      /* hizb 1  */ intArrayOf(1, 1), intArrayOf(2, 26), intArrayOf(2, 44), intArrayOf(2, 60),
      /* hizb 2  */ intArrayOf(2, 75), intArrayOf(2, 92), intArrayOf(2, 106), intArrayOf(2, 124),
      /* hizb 3  */ intArrayOf(2, 142), intArrayOf(2, 158), intArrayOf(2, 177), intArrayOf(2, 189),
      /* hizb 4  */ intArrayOf(2, 203), intArrayOf(2, 219), intArrayOf(2, 233), intArrayOf(2, 243),
      /* hizb 5  */ intArrayOf(2, 253), intArrayOf(2, 263), intArrayOf(2, 272), intArrayOf(2, 283),
      /* hizb 6  */ intArrayOf(3, 15), intArrayOf(3, 33), intArrayOf(3, 52), intArrayOf(3, 75),
      /* hizb 7  */ intArrayOf(3, 92), intArrayOf(3, 113), intArrayOf(3, 133), intArrayOf(3, 153),
      /* hizb 8  */ intArrayOf(3, 171), intArrayOf(3, 186), intArrayOf(4, 1), intArrayOf(4, 12),
      /* hizb 9  */ intArrayOf(4, 24), intArrayOf(4, 36), intArrayOf(4, 58), intArrayOf(4, 74),
      /* hizb 10 */ intArrayOf(4, 87), intArrayOf(4, 97), intArrayOf(4, 114), intArrayOf(4, 140),
      /* hizb 11 */ intArrayOf(4, 148), intArrayOf(4, 163), intArrayOf(5, 1), intArrayOf(5, 12),
      /* hizb 12 */ intArrayOf(5, 27), intArrayOf(5, 41), intArrayOf(5, 49), intArrayOf(5, 67),
      /* hizb 13 */ intArrayOf(5, 82), intArrayOf(5, 97), intArrayOf(5, 111), intArrayOf(6, 13),
      /* hizb 14 */ intArrayOf(6, 36), intArrayOf(6, 59), intArrayOf(6, 74), intArrayOf(6, 95),
      /* hizb 15 */ intArrayOf(6, 111), intArrayOf(6, 127), intArrayOf(6, 141), intArrayOf(6, 151),
      /* hizb 16 */ intArrayOf(7, 1), intArrayOf(7, 31), intArrayOf(7, 47), intArrayOf(7, 65),
      /* hizb 17 */ intArrayOf(7, 88), intArrayOf(7, 117), intArrayOf(7, 142), intArrayOf(7, 156),
      /* hizb 18 */ intArrayOf(7, 171), intArrayOf(7, 189), intArrayOf(8, 1), intArrayOf(8, 22),
      /* hizb 19 */ intArrayOf(8, 41), intArrayOf(8, 60), intArrayOf(9, 1), intArrayOf(9, 19),
      /* hizb 20 */ intArrayOf(9, 34), intArrayOf(9, 46), intArrayOf(9, 61), intArrayOf(9, 75),
      /* hizb 21 */ intArrayOf(9, 93), intArrayOf(9, 111), intArrayOf(9, 122), intArrayOf(10, 11),
      /* hizb 22 */ intArrayOf(10, 26), intArrayOf(10, 49), intArrayOf(10, 71), intArrayOf(10, 90),
      /* hizb 23 */ intArrayOf(11, 1), intArrayOf(11, 24), intArrayOf(11, 41), intArrayOf(11, 61),
      /* hizb 24 */ intArrayOf(11, 84), intArrayOf(11, 108), intArrayOf(12, 7), intArrayOf(12, 23),
      /* hizb 25 */ intArrayOf(12, 53), intArrayOf(12, 77), intArrayOf(12, 101), intArrayOf(13, 1),
      /* hizb 26 */ intArrayOf(13, 19), intArrayOf(13, 35), intArrayOf(14, 10), intArrayOf(14, 28),
      /* hizb 27 */ intArrayOf(15, 1), intArrayOf(15, 49), intArrayOf(16, 1), intArrayOf(16, 30),
      /* hizb 28 */ intArrayOf(16, 51), intArrayOf(16, 79), intArrayOf(16, 90), intArrayOf(16, 111),
      /* hizb 29 */ intArrayOf(17, 1), intArrayOf(17, 23), intArrayOf(17, 50), intArrayOf(17, 70),
      /* hizb 30 */ intArrayOf(17, 99), intArrayOf(18, 17), intArrayOf(18, 30), intArrayOf(18, 51),
      /* hizb 31 */ intArrayOf(18, 75), intArrayOf(18, 99), intArrayOf(19, 22), intArrayOf(19, 59),
      /* hizb 32 */ intArrayOf(20, 1), intArrayOf(20, 55), intArrayOf(20, 83), intArrayOf(20, 111),
      /* hizb 33 */ intArrayOf(21, 1), intArrayOf(21, 30), intArrayOf(21, 51), intArrayOf(21, 83),
      /* hizb 34 */ intArrayOf(22, 1), intArrayOf(22, 19), intArrayOf(22, 38), intArrayOf(22, 60),
      /* hizb 35 */ intArrayOf(23, 1), intArrayOf(23, 39), intArrayOf(23, 75), intArrayOf(24, 1),
      /* hizb 36 */ intArrayOf(24, 21), intArrayOf(24, 35), intArrayOf(24, 53), intArrayOf(25, 1),
      /* hizb 37 */ intArrayOf(25, 21), intArrayOf(25, 45), intArrayOf(26, 1), intArrayOf(26, 52),
      /* hizb 38 */ intArrayOf(26, 111), intArrayOf(26, 160), intArrayOf(27, 1), intArrayOf(27, 27),
      /* hizb 39 */ intArrayOf(27, 56), intArrayOf(27, 82), intArrayOf(28, 12), intArrayOf(28, 29),
      /* hizb 40 */ intArrayOf(28, 51), intArrayOf(28, 71), intArrayOf(29, 1), intArrayOf(29, 26),
      /* hizb 41 */ intArrayOf(29, 46), intArrayOf(30, 1), intArrayOf(30, 30), intArrayOf(30, 54),
      /* hizb 42 */ intArrayOf(31, 22), intArrayOf(32, 11), intArrayOf(33, 1), intArrayOf(33, 18),
      /* hizb 43 */ intArrayOf(33, 31), intArrayOf(33, 49), intArrayOf(33, 60), intArrayOf(34, 10),
      /* hizb 44 */ intArrayOf(34, 24), intArrayOf(34, 46), intArrayOf(35, 15), intArrayOf(35, 41),
      /* hizb 45 */ intArrayOf(36, 28), intArrayOf(36, 60), intArrayOf(37, 22), intArrayOf(37, 83),
      /* hizb 46 */ intArrayOf(37, 145), intArrayOf(38, 21), intArrayOf(38, 52), intArrayOf(39, 8),
      /* hizb 47 */ intArrayOf(39, 32), intArrayOf(39, 53), intArrayOf(40, 1), intArrayOf(40, 21),
      /* hizb 48 */ intArrayOf(40, 41), intArrayOf(40, 66), intArrayOf(41, 1), intArrayOf(41, 25),
      /* hizb 49 */ intArrayOf(41, 47), intArrayOf(42, 13), intArrayOf(42, 27), intArrayOf(42, 51),
      /* hizb 50 */ intArrayOf(43, 24), intArrayOf(43, 57), intArrayOf(44, 25), intArrayOf(45, 12),
      /* hizb 51 */ intArrayOf(46, 1), intArrayOf(46, 21), intArrayOf(47, 10), intArrayOf(47, 33),
      /* hizb 52 */ intArrayOf(48, 18), intArrayOf(49, 1), intArrayOf(49, 14), intArrayOf(50, 27),
      /* hizb 53 */ intArrayOf(51, 31), intArrayOf(52, 24), intArrayOf(53, 26), intArrayOf(54, 9),
      /* hizb 54 */ intArrayOf(55, 1), intArrayOf(56, 1), intArrayOf(56, 75), intArrayOf(57, 16),
      /* hizb 55 */ intArrayOf(58, 1), intArrayOf(58, 14), intArrayOf(59, 11), intArrayOf(60, 7),
      /* hizb 56 */ intArrayOf(62, 1), intArrayOf(63, 9), intArrayOf(65, 1), intArrayOf(66, 1),
      /* hizb 57 */ intArrayOf(67, 1), intArrayOf(68, 1), intArrayOf(69, 1), intArrayOf(71, 1),
      /* hizb 58 */ intArrayOf(72, 1), intArrayOf(73, 20), intArrayOf(75, 1), intArrayOf(76, 19),
      /* hizb 59 */ intArrayOf(78, 1), intArrayOf(80, 1), intArrayOf(82, 1), intArrayOf(84, 1),
      /* hizb 60 */ intArrayOf(87, 1), intArrayOf(90, 1), intArrayOf(94, 1), intArrayOf(101, 1))
}
