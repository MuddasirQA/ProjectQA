package qa.com;

    public class Person {
        public String name;
        public String age;
        public String jobTitle;

        public Person(String name, String age, String jobTitle) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", jobTitle='" + jobTitle + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public String getAge() {
            return age;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }




    }



