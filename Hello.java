  class Hello {

    public static void main(String[] args) {

      System.out.println("This is a java app created using Docker");

    }

  }



  Test the image creation:

  $ docker images

  $ docker build -t test_image .

  $ docker images

  $ docker rmi test_image


