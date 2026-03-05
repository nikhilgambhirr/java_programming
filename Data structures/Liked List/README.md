
1) Singly Linear Linked List
   
      🔹 Definition
      
      In a Singly Linked List, each node contains:
      
      👉 Data
      Next (address of the next node)
      The last node’s Next = NULL.
      
      🔹 Structure
      
      👉 [Data | Next] → [Data | Next] → [Data | NULL]
      
      🔹 Features
      
      Traversal in one direction only (forward)
      
      Dynamic memory allocation
      
      Insertion and deletion are easy (if position is known)
      
      🔹 Disadvantages
      
      Cannot move backward
      
      Searching takes O(n) time

2) Doubly Linear Linked List
   
      🔹 Definition
      
      In a Doubly Linked List, each node contains:
      
      Prev
      
      👉 Data
      
      Next
      
      The first node’s Prev = NULL
      The last node’s Next = NULL
      
      🔹 Structure
      
      👉 NULL ← [Prev | Data | Next] ⇄ [Prev | Data | Next] → NULL
      
      🔹 Features
      
      Traversal in both directions (forward and backward)
      
      Deletion is easier because of Prev pointer
      
      🔹 Disadvantages
      
      Extra memory required (for Prev pointer)

3) Circular Singly Linked List
   
      🔹 Definition
      
      It is similar to a singly linked list, but:
      
      👉 The last node’s Next points to the first node instead of NULL.
      
      🔹 Structure
      
      👉 [Data | Next] → [Data | Next] → [Data | Next]
      
                   ↑______________________________|
                   
      🔹 Features
      
      Circular traversal
      
      Used in Queue and Round Robin Scheduling
      
      No NULL at the end

4) Circular Doubly Linked List
   
      🔹 Definition
      
      It is similar to a doubly linked list, but:
      
      Last node’s Next points to First
      
      First node’s Prev points to Last
      
      🔹 Structure
      
             ↔ ↔ ↔
      👉 [Prev | Data | Next]
      
           ↑               ↓
            ← ← ← ← ← ← ← ←
            
      🔹 Features
      
      Forward and backward traversal

Circular navigation
