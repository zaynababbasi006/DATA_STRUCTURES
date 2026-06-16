# DATA_STRUCTURES
CLASS TASKS 
## Stock Span Problem

The Stock Span Problem calculates, for each day, how many consecutive days before it (including the current day) had a price less than or equal to today's price. It's solved efficiently using a stack instead of a brute-force O(n²) approach.

### How it works

1. We maintain a stack that stores indices of days with strictly higher prices than the current day.
2. For each price, we pop all indices from the stack whose price is less than or equal to the current price — those days no longer matter since the current price dominates them.
3. If the stack becomes empty, it means all previous prices were lower or equal, so the span is `i + 1` (covers all days so far).
4. If the stack isn't empty, the span is the distance between the current index and the index now on top of the stack (the closest day with a strictly higher price).
5. The current index is then pushed onto the stack for future comparisons.

### Example

Input prices: `100 80 60 70 60 75 85`

Output:
Prices: 100 80 60 70 60 75 85

Spans:  1 1 1 2 1 4 6
