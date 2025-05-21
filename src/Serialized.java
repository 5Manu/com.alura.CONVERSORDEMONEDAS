public record Serialized(double conversion_result) {

    @Override
    public String toString() {
        return  Double.toString(conversion_result);
    }
}
