# Frequency Analyzer

This Java program reads a sequence of integers, calculates the frequency of each unique integer, and identifies the most frequently occurring number. The program continues to accept sequences until the input `0` is encountered, at which point it terminates. For each sequence, it outputs the frequency of each integer and the integer that appears most frequently.

## Table of Contents

- [Overview](#overview)
- [Purpose](#purpose)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Example Input and Output](#example-input-and-output)
- [Explanation](#explanation)
- [Further Exploration](#further-exploration)

---

## Overview

The program reads sequences of numbers and, for each sequence, calculates and displays the frequency of each unique integer. It also identifies the integer with the highest frequency within each sequence.

## Purpose

This project is a **learning exercise** focused on:
- Practicing with data structures like **HashMap** for frequency counting.
- Working with conditional logic to identify the maximum frequency.
- Handling user input sequences in a loop with stopping conditions.

## Features

- **Frequency Counting**: Calculates the frequency of each integer in the input sequence.
- **Most Frequent Integer Detection**: Identifies and outputs the integer with the highest frequency in each sequence.
- **Dynamic Input Handling**: Reads sequences continuously until a `0` is entered.

### Input Format

1. **Sequence Size**: Enter an integer `N`, the number of integers in the sequence.
2. **Sequence Elements**: Enter `N` integers to form the sequence.
3. Repeat or enter `0` to terminate the program.

Example:
```plaintext
5
2 3 2 4 2
4
1 1 1 2
0
```

### Output

For each sequence:
1. Each unique number and its frequency.
2. The most frequently occurring integer in the sequence.

## Example Input and Output

### Input

```plaintext
5
2 3 2 4 2
4
1 1 1 2
0
```

### Output

```plaintext
2 3
3 1
4 1
Most frequent: 2

1 3
2 1
Most frequent: 1
```

## Explanation

The program processes each sequence by:
1. Using a `HashMap` to count the frequency of each integer.
2. Identifying the integer with the highest frequency.
3. Printing each unique integer along with its frequency, followed by the integer with the highest frequency.
