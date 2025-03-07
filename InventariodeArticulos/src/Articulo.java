public class Articulo {
        private String nombre;
        private int cantidad;
        private int solicitudes;

        public Articulo(String nombre, int cantidad, int solicitudes) {
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.solicitudes = solicitudes;
        }

        public String getNombre() {
            return nombre;
        }

        public int getCantidad() {
            return cantidad;
        }

        public int getSolicitudes() {
            return solicitudes;
        }
    }

