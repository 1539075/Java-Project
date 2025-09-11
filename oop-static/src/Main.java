import java.util.StringJoiner;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	// public static void main(String[] args) {
	// 	// TODO: 给Person类增加一个静态字段count和静态方法getCount，统计实例的个数
	// 	Person p1 = new Person("小明");
	// 	System.out.println(Person.getCount()); // 1
	// 	Person p2 = new Person("小红");
	// 	System.out.println(Person.getCount()); // 2
	// 	Person p3 = new Person("小军");
	// 	System.out.println(Person.getCount()); // 3
	// }
	 public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
		String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }

    static String buildInsertSql(String table, String[] fields) {
        // TODO:
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO ");
		sb.append(table);
		sb.append(" (");
		for (int i = 0; i < fields.length; i++) {
			sb.append(fields[i]);
			if (i < fields.length - 1) {
				sb.append(", ");
			}
		}
		sb.append(") VALUES (");
		for (int i = 0; i < fields.length; i++) {
			sb.append("?");
			if (i < fields.length - 1) {
				sb.append(", ");
			}
		}
		sb.append(")");
        return sb.toString();
    }
	static String buildSelectSql(String table, String[] fields) {
        // TODO:
		StringJoiner joiner = new StringJoiner(", ","SELECT ", " FROM " + table);
		for (String field : fields) {
			joiner.add(field);
		}

        return joiner.toString();
    }

}
