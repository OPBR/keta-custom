/**
 * There are <a href="https://github.com/ketayao/keta-custom">keta-custom</a> code generation
 */
package com.sample.test;

/**
 * ʹ��Jetty���е���WebӦ��, ��Console����r�������¼���Ӧ��.
 * 
 */
public class QuickStartServer {  

	public static final int PORT = 9090;
	public static final String CONTEXT = "/keta-custom-generate";
	public static final String BASE_URL = "http://localhost:" + PORT + CONTEXT;
	public static final String[] TLD_JAR_NAMES = new String[] {"spring-webmvc", "shiro-web",
			"springside-core" };
	// ������·��
	private static final String KETA_CUSTOM_COMPONENT_RESOURCES = "../keta-custom-component/src/main/webapp";
	private static final String KETA_CUSTOM_COMPONENT_CLASSES = "../keta-custom-component/target/classes";
	
	public static void main(String[] args) throws Exception {
		/*// �趨Spring��profile
		System.setProperty("spring.profiles.active", "production");

		JettyServer jettyServer = new JettyServer(PORT, CONTEXT);
		jettyServer.setTldJarNames(TLD_JAR_NAMES);
		
		jettyServer.addOtherResources(KETA_CUSTOM_COMPONENT_RESOURCES);
		jettyServer.addOtherClasses(KETA_CUSTOM_COMPONENT_CLASSES);
		// ����Jetty
		try {
			jettyServer.start();
			
			System.out.println("�����ɹ�����ʹ�ø�·������ϵͳ��" + BASE_URL);
			System.out.println("�ڿ���̨����'r'���¼���Ӧ�ã�����'q'�˳�jetty����");

			while (true) {
				char c = (char) System.in.read();
				if (c == 'r') {
					jettyServer.reloadContext();
				} else if (c == 'q') {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(-1);
		}*/
	}
}
