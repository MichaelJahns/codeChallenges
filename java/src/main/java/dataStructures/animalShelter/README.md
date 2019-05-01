## Animal Shelter
Create a data structure with a FIFO principal, but users can select if they want to dequeue a cat or a dog by preference


|Methods                              | Functionality                                                                                                                                                       | Space  | Time  |         
|-------------------------------------|------------------------------------------- -------------------------------------------------------------------------------------------------------------------------|--------|-------|
| `peek()`                            | Returns the shelters Front, the animal thats been waiting the longest                                                                                               |  O(1)  | O(1)  |
| `peer()`                            | Returns the shelters Tail, the animal thats been waiting the shortest                                                                                               |  O(1)  | O(1)  |
| `enqueue(String Name, String type)` | Creates a new Animal with name of name and type of type, adds this node to the tail of the shelter                                                                  |  O(1)  | O(1)  |
| `dequeue()`                         | Standard queue dequeue, removes the Animal at the front                                                                                                             |  O(1)  | O(1)  |
| `dequque(String pref)`              | (WIP) Allos the user to select what type of animal they want to adopt, starts at the front and looks backwards, returns the first aniaml of that type encountered   |  O(1)  | O(n)  |


[White Board](https://github.com/MichaelJahns/codeChallenges/blob/master/java/src/assets/animalShelter.jpg)
