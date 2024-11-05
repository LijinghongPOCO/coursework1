int[] average_grades(int grades[][], int weights[]) {
    int numStudents = grades.length;
    int[] averages = new int[numStudents];

    // Loop through each student
    for (int i = 0; i < numStudents; i++) {
        int weightedSum = 0;

        // Loop through each grade for the student and calculate weighted sum
        for (int j = 0; j < grades[i].length; j++) {
            weightedSum += grades[i][j] * weights[j];
        }

        // Calculate the weighted average
        averages[i] = weightedSum / 100;
    }

    return averages;
}
