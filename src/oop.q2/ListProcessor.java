package oop.q2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ListProcessor - Main class for Quiz #2
 *
 * This class processes two lists based on the animation shown at
 * max.ge/oop_q23/t1/t1_giorgi_pirveli_2_49679162.html
 *
 * The processor contains Task1 as an inner class that handles the actual
 * list processing logic.
 *
 * @author Giorgi Pirveli
 * @version 1.0
 * @since 2025-05-15
 */
public class ListProcessor {

    /**
     * Task1 - Inner class that performs the list processing
     *
     * This class uses integer values from list1 as indices to select
     * elements from list2, creating a new result list (list3).
     */
    public static class Task1 {
        /** List of integers used as indices */
        private List<Integer> list1;

        /** List of strings from which elements are selected */
        private List<String> list2;

        /** Result list containing selected elements */
        private List<String> list3;

        /**
         * Constructor initializes the lists with predefined values from the animation
         */
        public Task1() {
            // Initialize list1 with integer values from the animation
            list1 = new ArrayList<>(Arrays.asList(7, 5, 8, 7, 4, 9, 2, 2, 3, 8, 3, 5, 3));

            // Initialize list2 with string values from the animation
            list2 = new ArrayList<>(Arrays.asList(
                    "v2rg", "tH0", "sTYZd", "8us", "s2F", "SkGH", "UGR", "W9K7",
                    "Zk9mF", "rLohz", "obi", "8DN", "Kiwv", "N19fG", "1jg3", "6xE",
                    "ATeS", "Q7pcv"
            ));

            // Initialize result list
            list3 = new ArrayList<>();
        }

        /**
         * Alternative constructor that allows custom values for testing
         *
         * @param customList1 Custom integer values to use as indices
         * @param customList2 Custom string values to select from
         */
        public Task1(List<Integer> customList1, List<String> customList2) {
            this.list1 = new ArrayList<>(customList1);
            this.list2 = new ArrayList<>(customList2);
            this.list3 = new ArrayList<>();
        }

        /**
         * Performs the main processing operation: uses integers from list1 as indices
         * to select elements from list2, creating list3.
         *
         * @return The result list (list3) containing selected elements
         */
        public List<String> processLists() {
            list3.clear(); // Clear any previous results

            for (Integer index : list1) {
                // Check if the index is valid for list2
                if (index >= 0 && index < list2.size()) {
                    // Use the integer as an index to select an element from list2
                    String selectedElement = list2.get(index);
                    list3.add(selectedElement);
                } else {
                    // Handle invalid indices
                    System.err.println("Warning: Index " + index + " is out of bounds for list2");
                }
            }

            return new ArrayList<>(list3);
        }

        /**
         * Displays the initial lists, processing steps, and final result
         */
        public void displayResults() {
            System.out.println("=== Task 1: List Processing ===");
            System.out.println();

            System.out.println("Initial Lists:");
            System.out.println("List 1 (Indices): " + list1);
            System.out.println("List 2 (Elements): " + list2);
            System.out.println();

            // Process the lists
            List<String> result = processLists();

            System.out.println("Processing Steps:");
            for (int i = 0; i < list1.size(); i++) {
                int index = list1.get(i);
                if (index >= 0 && index < list2.size()) {
                    String element = list2.get(index);
                    System.out.println("list1[" + i + "] = " + index + " -> list2[" + index + "] = \"" + element + "\"");
                }
            }
            System.out.println();

            System.out.println("Result:");
            System.out.println("List 3 (Result): " + result);
            System.out.println();

            // Verify against expected result
            List<String> expectedResult = Arrays.asList(
                    "W9K7", "SkGH", "Zk9mF", "W9K7", "s2F", "rLohz", "sTYZd",
                    "sTYZd", "8us", "Zk9mF", "8us", "SkGH", "8us"
            );

            boolean matches = result.equals(expectedResult);
            System.out.println("Expected Result: " + expectedResult);
            System.out.println("Results Match: " + matches);
        }

        // Getters
        public List<Integer> getList1() { return new ArrayList<>(list1); }
        public List<String> getList2() { return new ArrayList<>(list2); }
        public List<String> getList3() { return new ArrayList<>(list3); }
    }

    /**
     * Main method to run the program
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create and run Task1
        Task1 task = new Task1();
        task.displayResults();

        // Example with custom values
        System.out.println("\n=== Custom Example ===");
        List<Integer> customIndices = Arrays.asList(0, 2, 1, 0);
        List<String> customElements = Arrays.asList("first", "second", "third");

        Task1 customTask = new Task1(customIndices, customElements);
        customTask.displayResults();
    }
}