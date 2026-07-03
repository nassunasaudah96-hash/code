BufferedReader reader = null;
try {
    reader = new BufferedReader(new FileReader("file.txt"));
    // read
} finally {
    if (reader != null) reader.close();
}