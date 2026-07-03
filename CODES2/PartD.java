try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
    // read file
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}  // reader is automatically closed