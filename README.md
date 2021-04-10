# bitmap-transformer

This is an application that can edits the colors of a bmp image and add some filters.

This application consists of 6 classes:
1. App Class: It is the main class of the app that defines the arguments of the input, which are file directory, where should be the file saved after changing and the transformer that should be applied on the image.
2. Bitmap Class: It is a class that contains the setters and getters methods to get and set the file directory. Also, it has the read and write methods.
3. GreenFilter Class: It is the class that contains the method to be applied on the image to change the RGB colors to be more green.
4. GrayScale Class: It is the class that contains the method to be applied on the image to change the RGB colors to grey scale.
5. InvertTransformation: It is the class that contains the method to be applied on the image to pixilate the image.
6. VerticalBlackBars: It is the class that contains the method to be applied on the image to add black bars vertically on the image.

Also, there is an additional class for testing the code.