public abstract class Employee {
        private String name;
        private int id;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        // Abstrakt metódusnál nem kell body {}!!!
        public abstract void work();

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Employee{");
            sb.append("name='").append(name).append('\'');
            sb.append(", id=").append(id);
            sb.append('}');
            return sb.toString();
        }
    }
