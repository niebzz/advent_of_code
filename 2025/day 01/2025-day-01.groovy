String filepath = '2025\\day 01\\2025-day-01-input.txt'

List input = new File(filepath).getText().split()

int position = 50 // 50 is starting position
int multiplier = 1

int min = 0
int max = 99

int part1 = 0
int part2 = 0

for (String line : input) {
    String direction = line[0]
    int quantity = line[1..-1].toInteger()

    if (direction == "L") {
        multiplier = -1
    } else if (direction == "R") {
        multiplier = 1
    }

    for (int i = 0; i < quantity; i++) {
        position += (1 * multiplier)

        if (position < min) {
            position = max
        } else if (position > max) {
            position = min
        }

        if (position == 0) {
            part2 += 1
        }
    }

    if (position == min) {
        part1 += 1
    }
}

print "Part 1: ${part1} \n"
print "Part 2: ${part2}"
