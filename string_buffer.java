/*
 String is immutable
 Synchronisation is related with multi threading.
 StringBuffer- synchronised
 {
                                                                                    STRING BUFFER
 SYNTAX -
 StringBuffer a=new StringBuffer();-------->it represents empty object with maximum 16 characters.
 StringBuffer a=new StringBuffer(n);-------->it represents empty object with maximum n characters.*****                                 **********
 StringBuffer a=new StringBuffer("hello");-------->it represents data object with data 'hello'.
 
 CONCATINATION-
 APPEND method - <object>.append("abc")
 
 <object>.INSERT(i,x)------ i is index to be changed
                ------ x is any datatype.****                                                           **********
 
 <object>.delete(i,j) & deleteCharat(i)

 <object>.replace(i,j,str)
 
 <object>.reverse();
 
 int = <object>.length
 
 int = <object>.index([string])
 
 int = <object>lastIndexOf
 
 <object>.substring(n)
 
 <object>.subSequence(n,m)
 
 
 
 
                                                                                    STRING BUILDER
 StringBuilder- unsynchronised
 
 ALL FUNCTIONS SAME
 
 */

import java.util.*;

public class string_buffer
