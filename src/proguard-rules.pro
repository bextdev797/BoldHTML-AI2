# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.boldhtml.BoldHTML {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/boldhtml/repack'
-flattenpackagehierarchy
-dontpreverify
