/*
 Array
 limitations:
 1. fixed size of array
 2. contains only homogenous elements
 3. no readymade functions available
 ---just a basic collection of elements
 
 Collection:
 1.hetrogenous
 2.objects only
 3.based on defined DS
 4.in runtime
 
 //ARRAY>COLLECTION in performance
 
SPACE = CAPACITY*3/2+1 -------- IMPLICIT
 
 
 collection interface(with all the functions)
    - list ---------child interfaces
    -vector
    -list
        +array(classes)
        +vector(classes)
        +capacity(classes)
    -
    -
 COLLECTIONS IS A UTILITY CLASS
 
 
 ==methods in collection interface(used with all interfaces)
 
 boolean    add         (object);
 boolean    addAll      (collection c); ++++ add to current collection from another collection (list one to list 2)
 boolean    remove      (object o);
 boolean    removeAll   (collection c);
 boolean    retainAll   (collection c); ++++ retain all elements from common (INTERSECTION).
 int        size        ();
 int        clear       ();
 boolean    contains    (object o); +++++ searching.
 boolean    containAll  (collection c); ++++ SEARCHING ALL
 object[]   toArray     ();
 boolean    equals      (object o);
 
 
 ==
 iteration
 
 for each
    for(variable:collection)
        {
        ****body****
        }
 boolean    hasNext     ();
 object     next        ();
 object     remove      ();
 
        list iterator
 boolean         hasNext        ();
 boolean         hasPrevious    ();
 
 
 */
